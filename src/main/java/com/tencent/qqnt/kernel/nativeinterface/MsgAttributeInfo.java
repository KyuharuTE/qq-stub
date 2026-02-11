package com.tencent.qqnt.kernel.nativeinterface;

import java.util.HashMap;

public final class MsgAttributeInfo {
    public AdelieMsgAttr adelieMsgAttr;
    public AttaReportData attaReportData;
    public long attrId;
    public int attrType;
    public HashMap<Integer, ExtendBusinessAttr> extendBusiness;
    public FeedBackStateInfo feedBackStateInfo;
    public TempChatGameSession gameChatSession;
    public GroupDragonLadderAttr groupDragonLadder;
    public GroupHonor groupHonor;
    public KingHonor kingHonor;
    public LiteActionAttr liteAction;
    public LongMsgAttr longMsgAttr;
    public MemoryStateMsgInfo memoryStateMsgInfo;
    public PublicAccountAttrs publicAccountAttrs;
    public QQConnectAttr qqConnectAttr;
    public RobotMsgExt robotExt;
    public SendMsgRspTransSvrInfoAttr sendMsgRspTransSvrInfo;
    public SharedMsgInfo sharedMsgInfo;
    public UinInfoAttr uinInfoAttr;
    public VASMsgElement vasMsgInfo;
    public VASAIOPersonalElement vasPersonalInfo;
    public ZPlanMsgElement zPlanMsgInfo;

    public MsgAttributeInfo() {
    }

    public AdelieMsgAttr getAdelieMsgAttr() {
        return this.adelieMsgAttr;
    }

    public AttaReportData getAttaReportData() {
        return this.attaReportData;
    }

    public long getAttrId() {
        return this.attrId;
    }

    public int getAttrType() {
        return this.attrType;
    }

    public HashMap<Integer, ExtendBusinessAttr> getExtendBusiness() {
        return this.extendBusiness;
    }

    public FeedBackStateInfo getFeedBackStateInfo() {
        return this.feedBackStateInfo;
    }

    public TempChatGameSession getGameChatSession() {
        return this.gameChatSession;
    }

    public GroupDragonLadderAttr getGroupDragonLadder() {
        return this.groupDragonLadder;
    }

    public GroupHonor getGroupHonor() {
        return this.groupHonor;
    }

    public KingHonor getKingHonor() {
        return this.kingHonor;
    }

    public LiteActionAttr getLiteAction() {
        return this.liteAction;
    }

    public LongMsgAttr getLongMsgAttr() {
        return this.longMsgAttr;
    }

    public MemoryStateMsgInfo getMemoryStateMsgInfo() {
        return this.memoryStateMsgInfo;
    }

    public PublicAccountAttrs getPublicAccountAttrs() {
        return this.publicAccountAttrs;
    }

    public QQConnectAttr getQqConnectAttr() {
        return this.qqConnectAttr;
    }

    public RobotMsgExt getRobotExt() {
        return this.robotExt;
    }

    public SendMsgRspTransSvrInfoAttr getSendMsgRspTransSvrInfo() {
        return this.sendMsgRspTransSvrInfo;
    }

    public SharedMsgInfo getSharedMsgInfo() {
        return this.sharedMsgInfo;
    }

    public UinInfoAttr getUinInfoAttr() {
        return this.uinInfoAttr;
    }

    public VASMsgElement getVasMsgInfo() {
        return this.vasMsgInfo;
    }

    public VASAIOPersonalElement getVasPersonalInfo() {
        return this.vasPersonalInfo;
    }

    public ZPlanMsgElement getZPlanMsgInfo() {
        return this.zPlanMsgInfo;
    }

    public String toString() {
        return "MsgAttributeInfo{attrType=" + this.attrType + ",attrId=" + this.attrId + ",vasMsgInfo=" + this.vasMsgInfo + ",vasPersonalInfo=" + this.vasPersonalInfo + ",groupHonor=" + this.groupHonor + ",kingHonor=" + this.kingHonor + ",publicAccountAttrs=" + this.publicAccountAttrs + ",sharedMsgInfo=" + this.sharedMsgInfo + ",gameChatSession=" + this.gameChatSession + ",uinInfoAttr=" + this.uinInfoAttr + ",longMsgAttr=" + this.longMsgAttr + ",robotExt=" + this.robotExt + ",zPlanMsgInfo=" + this.zPlanMsgInfo + ",qqConnectAttr=" + this.qqConnectAttr + ",extendBusiness=" + this.extendBusiness + ",sendMsgRspTransSvrInfo=" + this.sendMsgRspTransSvrInfo + ",adelieMsgAttr=" + this.adelieMsgAttr + ",feedBackStateInfo=" + this.feedBackStateInfo + ",memoryStateMsgInfo=" + this.memoryStateMsgInfo + ",attaReportData=" + this.attaReportData + ",liteAction=" + this.liteAction + ",groupDragonLadder=" + this.groupDragonLadder + ",}";
    }

    // For QQ 8.9.63
    public MsgAttributeInfo(int attrType, long attrId, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr) {}

    // For QQ 8.9.68
    public MsgAttributeInfo(int attrType, long attrId, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr, RobotMsgExt robotMsgExt) {}

    // For QQ 8.9.70
    public MsgAttributeInfo(int attrType, long attrId, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr, RobotMsgExt robotMsgExt, ZPlanMsgElement zPlanMsgElement) {}

    // For QQ 9.2.0
    public MsgAttributeInfo(int i, long j, VASMsgElement vASMsgElement, VASAIOPersonalElement vASAIOPersonalElement, GroupHonor groupHonor, KingHonor kingHonor, PublicAccountAttrs publicAccountAttrs, SharedMsgInfo sharedMsgInfo, TempChatGameSession tempChatGameSession, UinInfoAttr uinInfoAttr, LongMsgAttr longMsgAttr, RobotMsgExt robotMsgExt, ZPlanMsgElement zPlanMsgElement, QQConnectAttr qQConnectAttr, HashMap<Integer, ExtendBusinessAttr> hashMap, SendMsgRspTransSvrInfoAttr sendMsgRspTransSvrInfoAttr, AdelieMsgAttr adelieMsgAttr, FeedBackStateInfo feedBackStateInfo, MemoryStateMsgInfo memoryStateMsgInfo) {}
}
