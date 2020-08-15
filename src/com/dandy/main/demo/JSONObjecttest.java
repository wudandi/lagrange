package com.dandy.main.demo;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class JSONObjecttest {
    public void Id(){
        String json="{\n" +
                "    \"retCode\": \"0\",\n" +
                "    \"retJSON\": {\n" +
                "        \"result\": [\n" +
                "            {\n" +
                "                \"con_jhbh\": \"2020-521370\",\n" +
                "                \"magazinid\": null,\n" +
                "                \"con_eamid\": null,\n" +
                "                \"con_fzgdh\": null,\n" +
                "                \"con_zylx\": \"ZA2\",\n" +
                "                \"con_jhlb\": \"UZJH\",\n" +
                "                \"con_xl\": \"LIN5\",\n" +
                "                \"con_sbr\": \"02674\",\n" +
                "                \"con_sbrdh\": \"13728829660\",\n" +
                "                \"con_zydm\": \"5ZA2-401\",\n" +
                "                \"con_djlx\": null,\n" +
                "                \"con_ct\": null,\n" +
                "                \"con_sbsj\": null,\n" +
                "                \"con_zylh\": \"[维修]字(0702)4\",\n" +
                "                \"con_spzt\": \"ZYL\",\n" +
                "                \"con_zydw\": \"0107120206\",\n" +
                "                \"con_sgfzr\": \"02463\",\n" +
                "                \"con_sgfzrdh\": \"13691615120/685120\",\n" +
                "                \"con_zymc\": null,\n" +
                "                \"con_zykssj\": \"2020-07-02 01:00:00\",\n" +
                "                \"con_zyjssj\": \"2020-07-02 04:00:00\",\n" +
                "                \"con_zydd\": \"ZX\",\n" +
                "                \"con_gdap\": \"3\",\n" +
                "                \"con_gcc\": \"1\",\n" +
                "                \"con_dkc\": \"1\",\n" +
                "                \"con_jcsg\": \"0\",\n" +
                "                \"con_zyph\": \"1\",\n" +
                "                \"con_phnr\": \"开行工程车\",\n" +
                "                \"con_phbm\": \"01062603\",\n" +
                "                \"con_fjh\": null,\n" +
                "                \"con_gzp\": null,\n" +
                "                \"con_zyqy\": \"怡景站A ~ 五号线黄贝岭末端,上下行线。\\r\\n含辅助线。\",\n" +
                "                \"con_tdqj\": \"5S13,5X12,5X13 供电臂停电不挂地线。\",\n" +
                "                \"con_zynr\": \"W505磨轨车打磨调试作业\",\n" +
                "                \"con_fhcs\": \"严格按检修工艺卡或相关方案执行\",\n" +
                "                \"con_phyq\": null,\n" +
                "                \"con_yxfw\": null,\n" +
                "                \"con_bz\": \"1、列车编组：W505磨轨车+牵引机车2台，推进出厂；；2、0：00前在塘朗车辆段整备完毕待令，跟随末班车出厂，作业结束后按行调命令返回塘朗车辆段；3、需车辆中心安排司机配合解挂钩；4、凭调度命令及施工负责人指令动车；5、开隧道通风及照明，施工作业区域会产生高温和粉尘可能造成感温光纤、烟感报警；6、此作业需封锁作业区域。\",\n" +
                "                \"con_dhwxzy\": null,\n" +
                "                \"con_gkzy\": null,\n" +
                "                \"con_fbkjzy\": null,\n" +
                "                \"con_yxdlzy\": null,\n" +
                "                \"con_lsyd\": null,\n" +
                "                \"con_hdcqy1\": null,\n" +
                "                \"con_hdckssj1\": null,\n" +
                "                \"con_hdcjssj1\": null,\n" +
                "                \"con_hdcqy2\": null,\n" +
                "                \"con_hdckssj2\": null,\n" +
                "                \"con_hdcjssj2\": null,\n" +
                "                \"con_ctxx\": null,\n" +
                "                \"con_iscopy\": \"1\",\n" +
                "                \"con_childplan\": null,\n" +
                "                \"con_childcount\": null,\n" +
                "                \"con_phbmmc\": \"车辆中心车厂部运用车间\",\n" +
                "                \"con_zydwmc\": \"维修中心安全技术部安全技术室工务车辆运用三工班\",\n" +
                "                \"con_sgfzrmc\": \"唐中强\",\n" +
                "                \"con_notjcct\": \"-\",\n" +
                "                \"con_fzydm\": null,\n" +
                "                \"con_czydm\": null,\n" +
                "                \"con_state\": null,\n" +
                "                \"con_sm\": null,\n" +
                "                \"con_zycd\": null,\n" +
                "                \"con_type\": null,\n" +
                "                \"con_hxdstate\": null,\n" +
                "                \"con_hxdstatue\": null,\n" +
                "                \"con_fjhgdx\": null,\n" +
                "                \"con_role\": \"G-CJZGZYGCS\",\n" +
                "                \"con_sbjf\": null,\n" +
                "                \"con_tsdstatue\": null,\n" +
                "                \"con_aidline\": \"LIN511,LIN512,LIN517,LIN524,LIN525\",\n" +
                "                \"con_sftx\": \"0\",\n" +
                "                \"con_fhcsurl\": null,\n" +
                "                \"con_bzurl\": null,\n" +
                "                \"con_fhcsfilename\": null,\n" +
                "                \"con_bzfilename\": null,\n" +
                "                \"con_phry\": null,\n" +
                "                \"con_phrymc\": null,\n" +
                "                \"con_xcpath\": \"出厂路径:塘朗出段线>长岭陂上行线>怡景上行线\\r\\n回厂路径:怡景上行线>长岭陂上行线>塘朗出段线\",\n" +
                "                \"con_jcddxx\": null\n" +
                "            },\n" +
                "            {\n" +
                "                \"con_jhbh\": \"2020-919190\",\n" +
                "                \"magazinid\": null,\n" +
                "                \"con_eamid\": null,\n" +
                "                \"con_fzgdh\": null,\n" +
                "                \"con_zylx\": \"ZE1\",\n" +
                "                \"con_jhlb\": \"UZJH\",\n" +
                "                \"con_xl\": \"LIN9\",\n" +
                "                \"con_sbr\": \"21744\",\n" +
                "                \"con_sbrdh\": \"13725582370\",\n" +
                "                \"con_zydm\": \"9ZE1-602\",\n" +
                "                \"con_djlx\": null,\n" +
                "                \"con_ct\": null,\n" +
                "                \"con_sbsj\": null,\n" +
                "                \"con_zylh\": \"[维修]字(0704)24\",\n" +
                "                \"con_spzt\": \"ZYL\",\n" +
                "                \"con_zydw\": \"0107230906\",\n" +
                "                \"con_sgfzr\": \"16013\",\n" +
                "                \"con_sgfzrdh\": \"18898657535/617535\",\n" +
                "                \"con_zymc\": null,\n" +
                "                \"con_zykssj\": \"2020-07-04 01:00:00\",\n" +
                "                \"con_zyjssj\": \"2020-07-04 04:30:00\",\n" +
                "                \"con_zydd\": \"ZX\",\n" +
                "                \"con_gdap\": \"1\",\n" +
                "                \"con_gcc\": \"0\",\n" +
                "                \"con_dkc\": \"0\",\n" +
                "                \"con_jcsg\": \"0\",\n" +
                "                \"con_zyph\": \"1\",\n" +
                "                \"con_phnr\": \"作业前请机电专业配合解除受影响的三级负荷总开关联锁功能，将冷水机组调到不受影响的回路开启，将QS开关摇至隔离位，并做好突发性故障的处理\",\n" +
                "                \"con_phbm\": \"01322309\",\n" +
                "                \"con_fjh\": null,\n" +
                "                \"con_gzp\": null,\n" +
                "                \"con_zyqy\": \"深圳湾公园A ~ 深圳湾公园B。\",\n" +
                "                \"con_tdqj\": \"没有对应的停电区域信息 供电臂不需停电。\",\n" +
                "                \"con_zynr\": \"配合机电检修\",\n" +
                "                \"con_fhcs\": \"严格按检修工艺卡、工作票（或相关方案）执行\",\n" +
                "                \"con_phyq\": null,\n" +
                "                \"con_yxfw\": null,\n" +
                "                \"con_bz\": \"1、动力变压器ST5停电，一、二级负荷有短暂切换，三级负荷停电；2、作业前请机电专业配合解除受影响的三级负荷总开关联锁功能，将冷水机组调到不受影响的回路开启，将QS开关摇至隔离位，并做好突发性故障的处理；3、需相关专业监护自身设备情况。\",\n" +
                "                \"con_dhwxzy\": null,\n" +
                "                \"con_gkzy\": null,\n" +
                "                \"con_fbkjzy\": null,\n" +
                "                \"con_yxdlzy\": null,\n" +
                "                \"con_lsyd\": null,\n" +
                "                \"con_hdcqy1\": null,\n" +
                "                \"con_hdckssj1\": null,\n" +
                "                \"con_hdcjssj1\": null,\n" +
                "                \"con_hdcqy2\": null,\n" +
                "                \"con_hdckssj2\": null,\n" +
                "                \"con_hdcjssj2\": null,\n" +
                "                \"con_ctxx\": null,\n" +
                "                \"con_iscopy\": null,\n" +
                "                \"con_childplan\": null,\n" +
                "                \"con_childcount\": null,\n" +
                "                \"con_phbmmc\": \"客运二分公司维保二部维保九车间\",\n" +
                "                \"con_zydwmc\": \"维修中心供电三部供电九车间变电三工班\",\n" +
                "                \"con_sgfzrmc\": \"方泽平\",\n" +
                "                \"con_notjcct\": \"-\",\n" +
                "                \"con_fzydm\": null,\n" +
                "                \"con_czydm\": null,\n" +
                "                \"con_state\": null,\n" +
                "                \"con_sm\": null,\n" +
                "                \"con_zycd\": null,\n" +
                "                \"con_type\": null,\n" +
                "                \"con_hxdstate\": null,\n" +
                "                \"con_hxdstatue\": null,\n" +
                "                \"con_fjhgdx\": null,\n" +
                "                \"con_role\": \"G-CJZGZYGCS\",\n" +
                "                \"con_sbjf\": \"深圳湾公园混合变电所\",\n" +
                "                \"con_tsdstatue\": null,\n" +
                "                \"con_aidline\": null,\n" +
                "                \"con_sftx\": \"0\",\n" +
                "                \"con_fhcsurl\": null,\n" +
                "                \"con_bzurl\": null,\n" +
                "                \"con_fhcsfilename\": null,\n" +
                "                \"con_bzfilename\": null,\n" +
                "                \"con_phry\": null,\n" +
                "                \"con_phrymc\": null,\n" +
                "                \"con_xcpath\": null,\n" +
                "                \"con_jcddxx\": null\n" +
                "            },{\n" +
                "                \"con_jhbh\": \"2020-316890\",\n" +
                "                \"magazinid\": null,\n" +
                "                \"con_eamid\": null,\n" +
                "                \"con_fzgdh\": null,\n" +
                "                \"con_zylx\": \"ZF\",\n" +
                "                \"con_jhlb\": \"UCQX\",\n" +
                "                \"con_xl\": \"LIN3\",\n" +
                "                \"con_sbr\": \"11960\",\n" +
                "                \"con_sbrdh\": \"13427931212\",\n" +
                "                \"con_zydm\": \"3ZF-341\",\n" +
                "                \"con_djlx\": null,\n" +
                "                \"con_ct\": null,\n" +
                "                \"con_sbsj\": \"2020-07-01 00:00:00\",\n" +
                "                \"con_zylh\": \"[客三]字(0701)107\",\n" +
                "                \"con_spzt\": \"QXD\",\n" +
                "                \"con_zydw\": \"0133230306\",\n" +
                "                \"con_sgfzr\": \"K3SA083\",\n" +
                "                \"con_sgfzrdh\": \"15014033094\",\n" +
                "                \"con_zymc\": null,\n" +
                "                \"con_zykssj\": \"2020-07-01 10:05:00\",\n" +
                "                \"con_zyjssj\": \"2020-07-01 18:30:00\",\n" +
                "                \"con_zydd\": \"ZX\",\n" +
                "                \"con_gdap\": \"1\",\n" +
                "                \"con_gcc\": \"0\",\n" +
                "                \"con_dkc\": \"0\",\n" +
                "                \"con_jcsg\": \"0\",\n" +
                "                \"con_zyph\": \"0\",\n" +
                "                \"con_phnr\": null,\n" +
                "                \"con_phbm\": null,\n" +
                "                \"con_fjh\": null,\n" +
                "                \"con_gzp\": null,\n" +
                "                \"con_zyqy\": \"水贝A ~ 水贝B。\",\n" +
                "                \"con_tdqj\": \"没有对应的停电区域信息 供电臂不需停电。\",\n" +
                "                \"con_zynr\": \"空调风柜月检。\",\n" +
                "                \"con_fhcs\": \"施工负责人分工明确，责任到人，全体作业人员听从施工负责人统一指挥。\\r\\n不得单人作业。\",\n" +
                "                \"con_phyq\": null,\n" +
                "                \"con_yxfw\": null,\n" +
                "                \"con_bz\": \"不进入轨行区，不影响行车，不影响运营和客服质量。作业人员：贾正熙673094，柯工697455.\\r\\n施工负责人已确认进场施工3  人体温度均无异常。全部人员符合政府和深圳地铁集团公司的复工要求。\\r\\n\",\n" +
                "                \"con_dhwxzy\": null,\n" +
                "                \"con_gkzy\": null,\n" +
                "                \"con_fbkjzy\": null,\n" +
                "                \"con_yxdlzy\": null,\n" +
                "                \"con_lsyd\": null,\n" +
                "                \"con_hdcqy1\": null,\n" +
                "                \"con_hdckssj1\": null,\n" +
                "                \"con_hdcjssj1\": null,\n" +
                "                \"con_hdcqy2\": null,\n" +
                "                \"con_hdckssj2\": null,\n" +
                "                \"con_hdcjssj2\": null,\n" +
                "                \"con_ctxx\": null,\n" +
                "                \"con_iscopy\": null,\n" +
                "                \"con_childplan\": null,\n" +
                "                \"con_childcount\": null,\n" +
                "                \"con_phbmmc\": null,\n" +
                "                \"con_zydwmc\": \"客运三分公司维保三部维保三车间机电四工班\",\n" +
                "                \"con_sgfzrmc\": \"贾正熙\",\n" +
                "                \"con_notjcct\": \"-\",\n" +
                "                \"con_fzydm\": null,\n" +
                "                \"con_czydm\": null,\n" +
                "                \"con_state\": null,\n" +
                "                \"con_sm\": null,\n" +
                "                \"con_zycd\": null,\n" +
                "                \"con_type\": null,\n" +
                "                \"con_hxdstate\": null,\n" +
                "                \"con_hxdstatue\": null,\n" +
                "                \"con_fjhgdx\": null,\n" +
                "                \"con_role\": \"G-CZZBY\",\n" +
                "                \"con_sbjf\": null,\n" +
                "                \"con_tsdstatue\": null,\n" +
                "                \"con_aidline\": null,\n" +
                "                \"con_sftx\": \"0\",\n" +
                "                \"con_fhcsurl\": null,\n" +
                "                \"con_bzurl\": null,\n" +
                "                \"con_fhcsfilename\": null,\n" +
                "                \"con_bzfilename\": null,\n" +
                "                \"con_phry\": null,\n" +
                "                \"con_phrymc\": null,\n" +
                "                \"con_xcpath\": null,\n" +
                "                \"con_jcddxx\": null\n" +
                "            }\n" +
                "        ]\n" +
                "    }\n" +
                "}";

/*        //将json数组转换成可操作的JSONObject对象
        JSONObject jsonObject = JSONObject.parseObject(json);
        //取到对象内部的JSONArray数组
        JSONArray jsonArray=jsonObject.getJSONObject("retJSON").getJSONArray("result");

        //收集器 用于批量保存PlanBaseInfo实体
        Collection<PlanBaseInfo> planBaseInfoList = Lists.newArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            PlanBaseInfo planBaseInfo=new PlanBaseInfo();
            PlanMoreInfo planMoreInfo=new PlanMoreInfo();
            planBaseInfo.setPlanNum(jsonArray.getJSONObject(i).getString("con_jhbh"));//计划编号
            planBaseInfo.setWorkCode(jsonArray.getJSONObject(i).getString("con_zydm"));//作业代码
            planBaseInfo.setWorkNum(jsonArray.getJSONObject(i).getString("con_zylh"));//作业令号
            planBaseInfo.setWorkCode(jsonArray.getJSONObject(i).getString("con_xl"));//线路名称
            planBaseInfo.setPlanType(jsonArray.getJSONObject(i).getString("con_jhlb"));//计划类型
            planBaseInfo.setWorkTypeCode(jsonArray.getJSONObject(i).getString("con_zylx"));//作业类型
            planBaseInfo.setApplyJobNum(jsonArray.getJSONObject(i).getString("con_sbr"));//申请人
            planBaseInfo.setApplyPhone(jsonArray.getJSONObject(i).getString("con_sbrdh"));//电话
            planBaseInfo.setApplyDateTime(jsonArray.getJSONObject(i).getDate("con_sbsj"));//申报时间

            planMoreInfo.setDeptName(jsonArray.getJSONObject(i).getString("con_zydw"));//作业单位
            planMoreInfo.setDutyUserInfo(jsonArray.getJSONObject(i).getString("con_zydw"));//施工负责人
            planMoreInfo.setDutyUserPhone(jsonArray.getJSONObject(i).getString("con_sgfzrdh"));//施工负责人电话
            planMoreInfo.setWorkStartDateTime(jsonArray.getJSONObject(i).getDate("con_zykssj"));// 开始时间
            planMoreInfo.setWorkEndDateTime(jsonArray.getJSONObject(i).getDate("con_zyjssj"));//作业结束时间
            planMoreInfo.setPowerSupplyPlan(jsonArray.getJSONObject(i).getString("con_gdap"));//供电安排
            planMoreInfo.setIfCooperate(jsonArray.getJSONObject(i).getInteger("con_zyph").toString());//是否配合
            planMoreInfo.setIfCross(jsonArray.getJSONObject(i).getInteger("con_jcsg").toString());//是否交叉

            planMoreInfo.setStartEndPointId(jsonArray.getJSONObject(i).getInteger("con_gzp")); ;//起始车站
            planMoreInfo.setEndEndPointId(jsonArray.getJSONObject(i).getInteger("con_gzp"));//终止车站
            planMoreInfo.setLineType(jsonArray.getJSONObject(i).getString("con_xl"));//线别
            planMoreInfo.setIfTrackSubstation(jsonArray.getJSONObject(i).getString("con_sgfzr"));//辅助线、主所、occ、ncoo

            planMoreInfo.setWorkArea(jsonArray.getJSONObject(i).getString("con_zyqy"));//作业区域
            planMoreInfo.setWorkAreaRemarks(jsonArray.getJSONObject(i).getString("con_bz"));//区域备注
            planMoreInfo.setGuardMeasure(jsonArray.getJSONObject(i).getString("con_fhcs"));//防护措施
            planMoreInfo.setWorkContent(jsonArray.getJSONObject(i).getString("con_zynr"));//作业内容
            planMoreInfo.setRemarks(jsonArray.getJSONObject(i).getString("con_bz"));//备注

            // 条件构造器必须要写到循环内部，否则调用条件构造器的eq方法时，后一个循环目标值会叠加前一个循环的目标值构成新的目标值，删除方法除了一次循环有效之外都会失效，在数据库中找不到这个条件
            QueryWrapper<PlanBaseInfo> planBaseInfoQueryWrapper = new QueryWrapper<>();//new一个PlanBaseInfo类型的条件构造器
            planBaseInfoQueryWrapper.eq("plan_num",planBaseInfo.getPlanNum());
            PlanBaseInfo planBaseInfo1 =getOne(planBaseInfoQueryWrapper);
            if(planBaseInfo1 != null){
                removeById(planBaseInfo1.getId());
            }

            //保存两个数据库
           *//* save(planBaseInfo);
            //1.调用底层save方法直接保存moreinfo
            planMoreInfo.setPlanId(planBaseInfo.getId());
            planMoreInfoService.save(planMoreInfo);

            //2.调用接口写的方法保存moreinfo
            planBaseInfo.setPlanMoreInfo(planMoreInfo);
            planMoreInfoService.saveByPlan(planBaseInfo);
            *//*

            //用收集器收集（添加）实体
            planBaseInfo.setPlanMoreInfo(planMoreInfo);
            planBaseInfoList.add(planBaseInfo);
        }
        saveBatch(planBaseInfoList);//批量保存BaseInfo，之后会返回生成的id在收集器里面

        //批量保存MoreInfo（PlanMoreInfo条件构造器）
        Collection<PlanMoreInfo> planMoreInfoCollection = Lists.newArrayList();
        //遍历收集器 使用返回的id关联到moreinfo
        for(PlanBaseInfo planBaseInfo: planBaseInfoList){
            PlanMoreInfo planMoreInfo= planBaseInfo.getPlanMoreInfo();
            planMoreInfo.setPlanId(planBaseInfo.getId());
            planMoreInfoCollection.add(planMoreInfo);//用收集器收集（添加）实体
        }
        planMoreInfoService.saveBatch(planMoreInfoCollection);//批量保存
 */

//        SzApiResultVo<PlanTaskVo> szApiResultVo = restTemplate.getForObject(url+"?startDate="+startTime+"&"+"endDate="+endTime,SzApiResultVo.class);
//        List<PlanTaskVo> planTaskVoList = szApiResultVo.getRetJSON().get("result");

        //解析url地址
//        Date time1 = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String endTime = dateFormat.format(time1);
//        Date time2 = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24 * 7);
//        String startTime = dateFormat.format(time2);
//        SysDictData sysDictData = new SysDictData();
//        sysDictData.setDictType("SzApiDict");
//        sysDictData.setDictLabel("PlanBaseInfo");
//
//        String url = dictDataMapper.selectDictDataList(sysDictData).get(0).getDictValue();
//        String result = HttpUtils.sendGet(url, "startDate=" + startTime + "&" + "endDate=" + endTime);//解析url地址
//        JSONArray jsonArray = JSONObject.parseObject(result).getJSONObject("retJSON").getJSONArray("result");
//        List<PlanTaskVo> planTaskVoList = jsonArray.toJavaList(PlanTaskVo.class);

        //取到对象内部的JSONArray数组
//        JSONArray jsonArray=jsonObject.getJSONObject("retJSON").getJSONArray("result");

        //收集器 用于批量保存PlanBaseInfo实体
//        Collection<PlanBaseInfo> planBaseInfoList = Lists.newArrayList();

 /*       for (PlanTaskVo planTaskVo:planTaskVoList) {
            PlanBaseInfo planBaseInfo = new PlanBaseInfo();
            PlanMoreInfo planMoreInfo = new PlanMoreInfo();
            planBaseInfo.setPlanNum(planTaskVo.getCon_jhbh());

            planBaseInfo.setWorkCode(planTaskVo.getCon_zydm());//作业代码
            planBaseInfo.setWorkNum(planTaskVo.getCon_zylh());//作业令号
            planBaseInfo.setWorkCode(planTaskVo.getCon_xl());//线路名称
            planBaseInfo.setPlanType(planTaskVo.getCon_jhlb());//计划类型
            planBaseInfo.setWorkTypeCode(planTaskVo.getCon_zylx());//作业类型
            planBaseInfo.setApplyJobNum(planTaskVo.getCon_sbr());//申请人
            planBaseInfo.setApplyPhone(planTaskVo.getCon_sbrdh());//电话
            planBaseInfo.setApplyDateTime(planTaskVo.getCon_sbsj());//申报时间

            planMoreInfo.setDeptName(planTaskVo.getCon_zydw());//作业单位
            planMoreInfo.setDutyUserInfo(planTaskVo.getCon_zydw());//施工负责人
            planMoreInfo.setDutyUserPhone(planTaskVo.getCon_sgfzrdh());//施工负责人电话
            planMoreInfo.setWorkStartDateTime(planTaskVo.getCon_zykssj());// 开始时间
            planMoreInfo.setWorkEndDateTime(planTaskVo.getCon_zyjssj());//作业结束时间
            planMoreInfo.setPowerSupplyPlan(planTaskVo.getCon_gdap());//供电安排
            planMoreInfo.setIfCooperate(planTaskVo.getCon_zyph().toString());//是否配合
            planMoreInfo.setIfCross(planTaskVo.getCon_jcsg().toString());//是否交叉

            planMoreInfo.setStartEndPointId(planTaskVo.getCon_gzp());//起始车站
            planMoreInfo.setEndEndPointId(planTaskVo.getCon_gzp());//终止车站
            planMoreInfo.setLineType(planTaskVo.getCon_xl());//线别
            planMoreInfo.setIfTrackSubstation(planTaskVo.getCon_sgfzr());//辅助线、主所、occ、ncoo

            planMoreInfo.setWorkArea(planTaskVo.getCon_zyqy());//作业区域
            planMoreInfo.setWorkAreaRemarks(planTaskVo.getCon_bz());//区域备注
            planMoreInfo.setGuardMeasure(planTaskVo.getCon_fhcs());//防护措施
            planMoreInfo.setWorkContent(planTaskVo.getCon_zynr());//作业内容
            planMoreInfo.setRemarks(planTaskVo.getCon_bz());//备注


            planBaseInfoQueryWrapper.eq("plan_num", planBaseInfo.getPlanNum());
            PlanBaseInfo planBaseInfo1 = getOne(planBaseInfoQueryWrapper);
            if (planBaseInfo1 != null) {
                removeById(planBaseInfo1.getId());
            }
        }
        */
    }
}
