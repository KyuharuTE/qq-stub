package com.tencent.mobileqq.msfcore;

import java.util.HashMap;

/**
 * MSFRequestAdapter Stub 类 - 用于 Xposed 模块
 * 基于 QQ_9.2.90.apk 逆向生成
 */
public class MSFRequestAdapter {

    // 热修复重定向器（静态字段）
    private static com.tencent.mobileqq.qfix.redirect.IPatchRedirector $redirector_;

    // 实例字段
    private byte[] mA2;
    private String mCmd;
    private byte[] mD2;
    private byte[] mD2key;
    private byte[] mData;
    private int mOptions;
    private int mPacketType;
    private int mPriority;
    private int mResendNum;
    private byte[] mSecDeviceToken;
    private byte[] mSecExtra;
    private byte[] mSecSign;
    private int mSeq;
    private int mTimeout;
    private String mTraceInfo;
    private HashMap<String, byte[]> mTransInfo;
    private String mUid;
    private String mUin;
    private int mUinType;

    // 无参构造器
    public MSFRequestAdapter() {
        this.mUin = "";
        this.mUid = "";
        this.mCmd = "";
        this.mTraceInfo = "";
        this.mData = new byte[0];
        this.mA2 = new byte[0];
        this.mD2 = new byte[0];
        this.mD2key = new byte[0];
        this.mTransInfo = new HashMap<>();
        this.mSecSign = new byte[0];
        this.mSecDeviceToken = new byte[0];
        this.mSecExtra = new byte[0];
    }

    // 全参构造器
    public MSFRequestAdapter(int seq, int timeout, int resendNum, int options, int uinType, int packetType, int priority,
                             String uin, String uid, String cmd, String traceInfo, byte[] data, byte[] a2, byte[] d2, byte[] d2key,
                             HashMap<String, byte[]> transInfo, byte[] secSign, byte[] secDeviceToken, byte[] secExtra) {
        this.mSeq = seq;
        this.mTimeout = timeout;
        this.mResendNum = resendNum;
        this.mOptions = options;
        this.mUinType = uinType;
        this.mPacketType = packetType;
        this.mPriority = priority;
        this.mUin = uin;
        this.mUid = uid;
        this.mCmd = cmd;
        this.mTraceInfo = traceInfo;
        this.mData = data;
        this.mA2 = a2;
        this.mD2 = d2;
        this.mD2key = d2key;
        this.mTransInfo = transInfo;
        this.mSecSign = secSign;
        this.mSecDeviceToken = secDeviceToken;
        this.mSecExtra = secExtra;
    }

    // ========== Getter 方法 ==========

    public byte[] getA2() {
        return this.mA2;
    }

    public String getCmd() {
        return this.mCmd;
    }

    public byte[] getD2() {
        return this.mD2;
    }

    public byte[] getD2key() {
        return this.mD2key;
    }

    public byte[] getData() {
        return this.mData;
    }

    public int getOptions() {
        return this.mOptions;
    }

    public int getPacketType() {
        return this.mPacketType;
    }

    public int getPriority() {
        return this.mPriority;
    }

    public int getResendNum() {
        return this.mResendNum;
    }

    public byte[] getSecDeviceToken() {
        return this.mSecDeviceToken;
    }

    public byte[] getSecExtra() {
        return this.mSecExtra;
    }

    public byte[] getSecSign() {
        return this.mSecSign;
    }

    public int getSeq() {
        return this.mSeq;
    }

    public int getTimeout() {
        return this.mTimeout;
    }

    public String getTraceInfo() {
        return this.mTraceInfo;
    }

    public HashMap<String, byte[]> getTransInfo() {
        return this.mTransInfo;
    }

    public String getUid() {
        return this.mUid;
    }

    public String getUin() {
        return this.mUin;
    }

    public int getUinType() {
        return this.mUinType;
    }

    // ========== Setter 方法 ==========

    public void setA2(byte[] a2) {
        this.mA2 = a2;
    }

    public void setCmd(String cmd) {
        this.mCmd = cmd;
    }

    public void setD2(byte[] d2) {
        this.mD2 = d2;
    }

    public void setD2key(byte[] d2key) {
        this.mD2key = d2key;
    }

    public void setData(byte[] data) {
        this.mData = data;
    }

    public void setOptions(int options) {
        this.mOptions = options;
    }

    public void setPacketType(int packetType) {
        this.mPacketType = packetType;
    }

    public void setPriority(int priority) {
        this.mPriority = priority;
    }

    public void setResendNum(int resendNum) {
        this.mResendNum = resendNum;
    }

    public void setSecDeviceToken(byte[] secDeviceToken) {
        this.mSecDeviceToken = secDeviceToken;
    }

    public void setSecExtra(byte[] secExtra) {
        this.mSecExtra = secExtra;
    }

    public void setSecSign(byte[] secSign) {
        this.mSecSign = secSign;
    }

    public void setSeq(int seq) {
        this.mSeq = seq;
    }

    public void setTimeout(int timeout) {
        this.mTimeout = timeout;
    }

    public void setTraceInfo(String traceInfo) {
        this.mTraceInfo = traceInfo;
    }

    public void setTransInfo(HashMap<String, byte[]> transInfo) {
        this.mTransInfo = transInfo;
    }

    public void setUid(String uid) {
        this.mUid = uid;
    }

    public void setUin(String uin) {
        this.mUin = uin;
    }

    public void setUinType(int uinType) {
        this.mUinType = uinType;
    }

    // ========== toString 方法 ==========

    @Override
    public String toString() {
        return "MSFRequestAdapter{" +
                "mSeq=" + mSeq +
                ", mTimeout=" + mTimeout +
                ", mResendNum=" + mResendNum +
                ", mOptions=" + mOptions +
                ", mUinType=" + mUinType +
                ", mPacketType=" + mPacketType +
                ", mPriority=" + mPriority +
                ", mUin='" + mUin + '\'' +
                ", mUid='" + mUid + '\'' +
                ", mCmd='" + mCmd + '\'' +
                ", mTraceInfo='" + mTraceInfo + '\'' +
                ", mData=" + (mData != null ? mData.length + " bytes" : "null") +
                ", mA2=" + (mA2 != null ? mA2.length + " bytes" : "null") +
                ", mD2=" + (mD2 != null ? mD2.length + " bytes" : "null") +
                ", mD2key=" + (mD2key != null ? mD2key.length + " bytes" : "null") +
                ", mTransInfo=" + mTransInfo +
                ", mSecSign=" + (mSecSign != null ? mSecSign.length + " bytes" : "null") +
                ", mSecDeviceToken=" + (mSecDeviceToken != null ? mSecDeviceToken.length + " bytes" : "null") +
                ", mSecExtra=" + (mSecExtra != null ? mSecExtra.length + " bytes" : "null") +
                '}';
    }
}