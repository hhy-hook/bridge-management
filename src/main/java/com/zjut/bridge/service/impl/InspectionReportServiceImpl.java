package com.zjut.bridge.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjut.bridge.dao.BridgeDao;
import com.zjut.bridge.dao.InspectionReportDao;
import com.zjut.bridge.pojo.entity.Bridge;
import com.zjut.bridge.pojo.entity.InspectionReport;
import com.zjut.bridge.pojo.vo.ReportVO;
import com.zjut.bridge.service.InspectionReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InspectionReportServiceImpl implements InspectionReportService {

    @Resource
    InspectionReportDao inspectionReportDao;

    @Resource
    BridgeDao bridgeDao;

    @Override
    public JSONObject addReport(InspectionReport inspectionReport) {
        JSONObject json = new JSONObject();
        if(inspectionReportDao.insertSelective(inspectionReport) == 1){
            json.put("msg","success");
            json.put("code","0");
        }else{
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }

    @Override
    public int selectMaxPrimaryKey() {
        return inspectionReportDao.selectMaxPrimaryKey();
    }

    @Override
    public List<ReportVO> selectReports() {
        List<ReportVO> origin = inspectionReportDao.selectReports();
        for(ReportVO r : origin){
            Bridge bridge = bridgeDao.selectByPrimaryKey(r.getBridgeId());
            r.setBridge(bridge);
        }
        return origin;
    }

    @Override
    public JSONObject deleteByInspectorId(int id) {
        JSONObject json = new JSONObject();
        try{
            inspectionReportDao.deleteByInspectorId(id);
            json.put("msg","success");
            json.put("code","0");
        }catch (Exception e){
            e.printStackTrace();
            json.put("msg","error");
            json.put("code","222222");
        }
        return json;
    }
}
