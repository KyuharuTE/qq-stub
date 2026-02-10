package NS_MOBILE_FEEDS;

import NS_MOBILE_COMM.UgcRightInfo;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes7.dex */
public final class cell_comm extends JceStruct {
    static ArrayList<s_droplist_option> cache_custom_droplist;
    static Map<String, String> cache_extendInfo;
    static Map<String, byte[]> cache_extendInfoData;
    static UgcRightInfo cache_right_info = new UgcRightInfo();
    static Map<Integer, Integer> cache_stMapABTest = new HashMap();
    public int actiontype;
    public String actionurl;
    public long adv_stytle;
    public long adv_subtype;
    public int appid;
    public String clientkey;
    public int comment_view_num;
    public String curlikekey;
    public ArrayList<s_droplist_option> custom_droplist;
    public long editmask;
    public Map<String, String> extendInfo;
    public Map<String, byte[]> extendInfoData;
    public long feedsDelTime;
    public int feedsattr;
    public int feedsattr2;
    public long feedsattr3;
    public String feedsid;
    public String feedskey;
    public int feedstype;
    public int hot_score;
    public int iClick_area;
    public String icon_token;
    public String interestkey;
    public boolean is_kuolie;
    public boolean is_stay;
    public long lastmodify_time;
    public int operatemask;
    public int operatemask2;
    public long operatemask3;
    public String orglikekey;
    public int originaltype;
    public String paykey;
    public int positionmask;
    public int positionmask2;
    public boolean pull_qzone;
    public int recom_show_type;
    public int recomlayout;
    public long recomreportid;
    public int recomtype;
    public String refer;
    public int reportfeedsattr;
    public UgcRightInfo right_info;
    public int shield;
    public long show_mask;
    public int space_right;
    public String sqDynamicFeedsKey;
    public Map<Integer, Integer> stMapABTest;
    public int subid;
    public int time;
    public int uflag;
    public String ugckey;
    public String ugcrightkey;
    public int wup_feeds_type;

    static {
        cache_stMapABTest.put(0, 0);
        cache_custom_droplist = new ArrayList<>();
        cache_custom_droplist.add(new s_droplist_option());
        HashMap map = new HashMap();
        cache_extendInfo = map;
        map.put("", "");
        HashMap map2 = new HashMap();
        cache_extendInfoData = map2;
        map2.put("", new byte[]{0});
    }

    public cell_comm() {
        this.appid = 0;
        this.subid = 0;
        this.refer = "";
        this.time = 0;
        this.actiontype = 0;
        this.actionurl = "";
        this.originaltype = 0;
        this.operatemask = 0;
        this.feedskey = "";
        this.orglikekey = "";
        this.curlikekey = "";
        this.feedstype = 0;
        this.feedsattr = 0;
        this.ugckey = "";
        this.clientkey = "";
        this.show_mask = 0L;
        this.uflag = 0;
        this.shield = 0;
        this.ugcrightkey = "";
        this.interestkey = "";
        this.recomtype = 0;
        this.feedsid = "";
        this.adv_stytle = 0L;
        this.adv_subtype = 0L;
        this.right_info = null;
        this.recomlayout = 0;
        this.recomreportid = 0L;
        this.space_right = 0;
        this.reportfeedsattr = 0;
        this.recom_show_type = 0;
        this.wup_feeds_type = 0;
        this.stMapABTest = null;
        this.is_stay = false;
        this.paykey = "";
        this.operatemask2 = 0;
        this.positionmask = 0;
        this.positionmask2 = 0;
        this.editmask = 4294967295L;
        this.custom_droplist = null;
        this.extendInfo = null;
        this.feedsattr2 = 0;
        this.feedsDelTime = 0L;
        this.sqDynamicFeedsKey = "";
        this.iClick_area = 0;
        this.extendInfoData = null;
        this.hot_score = 0;
        this.is_kuolie = false;
        this.pull_qzone = false;
        this.operatemask3 = 0L;
        this.feedsattr3 = 0L;
        this.lastmodify_time = 0L;
        this.icon_token = "";
        this.comment_view_num = 0;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.appid, 0);
        jceOutputStream.write(this.subid, 1);
        String str = this.refer;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        jceOutputStream.write(this.time, 3);
        jceOutputStream.write(this.actiontype, 4);
        String str2 = this.actionurl;
        if (str2 != null) {
            jceOutputStream.write(str2, 5);
        }
        jceOutputStream.write(this.originaltype, 6);
        jceOutputStream.write(this.operatemask, 7);
        String str3 = this.feedskey;
        if (str3 != null) {
            jceOutputStream.write(str3, 8);
        }
        String str4 = this.orglikekey;
        if (str4 != null) {
            jceOutputStream.write(str4, 9);
        }
        String str5 = this.curlikekey;
        if (str5 != null) {
            jceOutputStream.write(str5, 10);
        }
        jceOutputStream.write(this.feedstype, 11);
        jceOutputStream.write(this.feedsattr, 12);
        String str6 = this.ugckey;
        if (str6 != null) {
            jceOutputStream.write(str6, 13);
        }
        String str7 = this.clientkey;
        if (str7 != null) {
            jceOutputStream.write(str7, 14);
        }
        jceOutputStream.write(this.show_mask, 15);
        jceOutputStream.write(this.uflag, 16);
        jceOutputStream.write(this.shield, 17);
        String str8 = this.ugcrightkey;
        if (str8 != null) {
            jceOutputStream.write(str8, 18);
        }
        String str9 = this.interestkey;
        if (str9 != null) {
            jceOutputStream.write(str9, 19);
        }
        jceOutputStream.write(this.recomtype, 20);
        String str10 = this.feedsid;
        if (str10 != null) {
            jceOutputStream.write(str10, 21);
        }
        jceOutputStream.write(this.adv_stytle, 22);
        jceOutputStream.write(this.adv_subtype, 23);
        UgcRightInfo ugcRightInfo = this.right_info;
        if (ugcRightInfo != null) {
            jceOutputStream.write((JceStruct) ugcRightInfo, 24);
        }
        jceOutputStream.write(this.recomlayout, 25);
        jceOutputStream.write(this.recomreportid, 26);
        jceOutputStream.write(this.space_right, 27);
        jceOutputStream.write(this.reportfeedsattr, 28);
        jceOutputStream.write(this.recom_show_type, 29);
        jceOutputStream.write(this.wup_feeds_type, 30);
        Map<Integer, Integer> map = this.stMapABTest;
        if (map != null) {
            jceOutputStream.write((Map) map, 31);
        }
        jceOutputStream.write(this.is_stay, 32);
        String str11 = this.paykey;
        if (str11 != null) {
            jceOutputStream.write(str11, 33);
        }
        jceOutputStream.write(this.operatemask2, 34);
        jceOutputStream.write(this.positionmask, 35);
        jceOutputStream.write(this.positionmask2, 36);
        jceOutputStream.write(this.editmask, 37);
        ArrayList<s_droplist_option> arrayList = this.custom_droplist;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 38);
        }
        Map<String, String> map2 = this.extendInfo;
        if (map2 != null) {
            jceOutputStream.write((Map) map2, 39);
        }
        jceOutputStream.write(this.feedsattr2, 40);
        jceOutputStream.write(this.feedsDelTime, 41);
        String str12 = this.sqDynamicFeedsKey;
        if (str12 != null) {
            jceOutputStream.write(str12, 42);
        }
        jceOutputStream.write(this.iClick_area, 43);
        Map<String, byte[]> map3 = this.extendInfoData;
        if (map3 != null) {
            jceOutputStream.write((Map) map3, 44);
        }
        jceOutputStream.write(this.hot_score, 45);
        jceOutputStream.write(this.is_kuolie, 46);
        jceOutputStream.write(this.pull_qzone, 47);
        jceOutputStream.write(this.operatemask3, 48);
        jceOutputStream.write(this.feedsattr3, 49);
        jceOutputStream.write(this.lastmodify_time, 50);
        String str13 = this.icon_token;
        if (str13 != null) {
            jceOutputStream.write(str13, 51);
        }
        jceOutputStream.write(this.comment_view_num, 52);
    }

    public cell_comm(int i15, int i16, String str, int i17, int i18, String str2, int i19, int i25, String str3, String str4, String str5, int i26, int i27, String str6, String str7, long j15, int i28, int i29, String str8, String str9, int i35, String str10, long j16, long j17, UgcRightInfo ugcRightInfo, int i36, long j18, int i37, int i38, int i39, int i45, Map<Integer, Integer> map, boolean z15, String str11, int i46, int i47, int i48, long j19, ArrayList<s_droplist_option> arrayList, Map<String, String> map2, int i49, long j25, String str12, int i55, Map<String, byte[]> map3, int i56, boolean z16, boolean z17, long j26, long j27, long j28, String str13, int i57) {
        this.appid = i15;
        this.subid = i16;
        this.refer = str;
        this.time = i17;
        this.actiontype = i18;
        this.actionurl = str2;
        this.originaltype = i19;
        this.operatemask = i25;
        this.feedskey = str3;
        this.orglikekey = str4;
        this.curlikekey = str5;
        this.feedstype = i26;
        this.feedsattr = i27;
        this.ugckey = str6;
        this.clientkey = str7;
        this.show_mask = j15;
        this.uflag = i28;
        this.shield = i29;
        this.ugcrightkey = str8;
        this.interestkey = str9;
        this.recomtype = i35;
        this.feedsid = str10;
        this.adv_stytle = j16;
        this.adv_subtype = j17;
        this.right_info = ugcRightInfo;
        this.recomlayout = i36;
        this.recomreportid = j18;
        this.space_right = i37;
        this.reportfeedsattr = i38;
        this.recom_show_type = i39;
        this.wup_feeds_type = i45;
        this.stMapABTest = map;
        this.is_stay = z15;
        this.paykey = str11;
        this.operatemask2 = i46;
        this.positionmask = i47;
        this.positionmask2 = i48;
        this.editmask = j19;
        this.custom_droplist = arrayList;
        this.extendInfo = map2;
        this.feedsattr2 = i49;
        this.feedsDelTime = j25;
        this.sqDynamicFeedsKey = str12;
        this.iClick_area = i55;
        this.extendInfoData = map3;
        this.hot_score = i56;
        this.is_kuolie = z16;
        this.pull_qzone = z17;
        this.operatemask3 = j26;
        this.feedsattr3 = j27;
        this.lastmodify_time = j28;
        this.icon_token = str13;
        this.comment_view_num = i57;
    }
}