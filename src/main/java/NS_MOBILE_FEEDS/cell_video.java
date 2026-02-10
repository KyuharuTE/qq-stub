package NS_MOBILE_FEEDS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes7.dex */
public final class cell_video extends JceStruct {
    static s_button cache_bottom_button;
    static Map<Integer, s_picurl> cache_coverurl = new HashMap();
    static Map<String, String> cache_extendinfo;
    static Map<Integer, s_picurl> cache_gaussPicUrl;
    static s_kingcard cache_stKingCard;
    static ArrayList<Map<Integer, s_picurl>> cache_vcCovers;
    static int cache_video_click_type;
    static ArrayList<s_videourl> cache_video_rate_list;
    static int cache_video_show_type;
    static int cache_video_source;
    static s_videoremark cache_videoremark;
    static Map<Integer, s_videourl> cache_videourls;
    static s_weishi cache_weishi;
    public int actiontype;
    public String actionurl;
    public int adv_delay_time;
    public String afterLayerJumpUrl;
    public String albumid;
    public int anonymity;
    public int auto_refresh_second;
    public s_button bottom_button;
    public String clientkey;
    public Map<Integer, s_picurl> coverurl;
    public int cur_video_rate;
    public Map<String, String> extendinfo;
    public int filetype;
    public Map<Integer, s_picurl> gaussPicUrl;
    public String header_desc;
    public boolean isHadSetPlayOnWifi;
    public boolean isOnWifiPlay;
    public boolean isPanorama;
    public boolean is_share;
    public String lloc;
    public int needShowFollowGuideAnimation;
    public byte playtype;
    public int report_video_feeds_type;
    public String sloc;
    public s_kingcard stKingCard;
    public String toast;
    public ArrayList<Map<Integer, s_picurl>> vcCovers;
    public int video_click_type;
    public String video_desc;
    public int video_form;
    public long video_max_playtime;
    public ArrayList<s_videourl> video_rate_list;
    public int video_show_type;
    public int video_source;
    public String video_webview_url;
    public String videoid;
    public int videoplaycnt;
    public s_videoremark videoremark;
    public int videostatus;
    public long videotime;
    public byte videotype;
    public String videourl;
    public Map<Integer, s_videourl> videourls;
    public s_weishi weishi;

    static {
        cache_coverurl.put(0, new s_picurl());
        cache_videourls = new HashMap();
        cache_videourls.put(0, new s_videourl());
        HashMap map = new HashMap();
        cache_extendinfo = map;
        map.put("", "");
        cache_videoremark = new s_videoremark();
        cache_video_show_type = 0;
        cache_video_source = 0;
        cache_vcCovers = new ArrayList<>();
        HashMap map2 = new HashMap();
        map2.put(0, new s_picurl());
        cache_vcCovers.add(map2);
        cache_gaussPicUrl = new HashMap();
        cache_gaussPicUrl.put(0, new s_picurl());
        cache_weishi = new s_weishi();
        cache_stKingCard = new s_kingcard();
        cache_bottom_button = new s_button();
        cache_video_click_type = 0;
        cache_video_rate_list = new ArrayList<>();
        cache_video_rate_list.add(new s_videourl());
    }

    public cell_video() {
        this.videoid = "";
        this.videourl = "";
        this.coverurl = null;
        this.actiontype = 0;
        this.actionurl = "";
        this.clientkey = "";
        this.filetype = 0;
        this.videotype = (byte) 0;
        this.videotime = 0L;
        this.videourls = null;
        this.playtype = (byte) 0;
        this.videostatus = 0;
        this.toast = "";
        this.extendinfo = null;
        this.videoremark = null;
        this.video_show_type = 0;
        this.isPanorama = false;
        this.video_source = 0;
        this.sloc = "";
        this.lloc = "";
        this.report_video_feeds_type = 0;
        this.videoplaycnt = 0;
        this.is_share = false;
        this.adv_delay_time = 0;
        this.video_webview_url = "";
        this.isOnWifiPlay = false;
        this.isHadSetPlayOnWifi = false;
        this.auto_refresh_second = 0;
        this.vcCovers = null;
        this.video_form = 0;
        this.gaussPicUrl = null;
        this.weishi = null;
        this.stKingCard = null;
        this.bottom_button = null;
        this.video_click_type = 0;
        this.header_desc = "";
        this.video_rate_list = null;
        this.cur_video_rate = 0;
        this.albumid = "";
        this.anonymity = 0;
        this.video_desc = "";
        this.video_max_playtime = 0L;
        this.needShowFollowGuideAnimation = 0;
        this.afterLayerJumpUrl = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.videoid;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        String str2 = this.videourl;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        Map<Integer, s_picurl> map = this.coverurl;
        if (map != null) {
            jceOutputStream.write((Map) map, 2);
        }
        jceOutputStream.write(this.actiontype, 3);
        String str3 = this.actionurl;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
        String str4 = this.clientkey;
        if (str4 != null) {
            jceOutputStream.write(str4, 5);
        }
        jceOutputStream.write(this.filetype, 6);
        jceOutputStream.write(this.videotype, 7);
        jceOutputStream.write(this.videotime, 8);
        Map<Integer, s_videourl> map2 = this.videourls;
        if (map2 != null) {
            jceOutputStream.write((Map) map2, 9);
        }
        jceOutputStream.write(this.playtype, 10);
        jceOutputStream.write(this.videostatus, 11);
        String str5 = this.toast;
        if (str5 != null) {
            jceOutputStream.write(str5, 12);
        }
        Map<String, String> map3 = this.extendinfo;
        if (map3 != null) {
            jceOutputStream.write((Map) map3, 13);
        }
        s_videoremark s_videoremarkVar = this.videoremark;
        if (s_videoremarkVar != null) {
            jceOutputStream.write((JceStruct) s_videoremarkVar, 14);
        }
        jceOutputStream.write(this.video_show_type, 15);
        jceOutputStream.write(this.isPanorama, 16);
        jceOutputStream.write(this.video_source, 17);
        String str6 = this.sloc;
        if (str6 != null) {
            jceOutputStream.write(str6, 18);
        }
        String str7 = this.lloc;
        if (str7 != null) {
            jceOutputStream.write(str7, 19);
        }
        jceOutputStream.write(this.report_video_feeds_type, 20);
        jceOutputStream.write(this.videoplaycnt, 21);
        jceOutputStream.write(this.is_share, 22);
        jceOutputStream.write(this.adv_delay_time, 23);
        String str8 = this.video_webview_url;
        if (str8 != null) {
            jceOutputStream.write(str8, 24);
        }
        jceOutputStream.write(this.isOnWifiPlay, 25);
        jceOutputStream.write(this.isHadSetPlayOnWifi, 26);
        jceOutputStream.write(this.auto_refresh_second, 27);
        ArrayList<Map<Integer, s_picurl>> arrayList = this.vcCovers;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 28);
        }
        jceOutputStream.write(this.video_form, 29);
        Map<Integer, s_picurl> map4 = this.gaussPicUrl;
        if (map4 != null) {
            jceOutputStream.write((Map) map4, 30);
        }
        s_weishi s_weishiVar = this.weishi;
        if (s_weishiVar != null) {
            jceOutputStream.write((JceStruct) s_weishiVar, 31);
        }
        s_kingcard s_kingcardVar = this.stKingCard;
        if (s_kingcardVar != null) {
            jceOutputStream.write((JceStruct) s_kingcardVar, 32);
        }
        s_button s_buttonVar = this.bottom_button;
        if (s_buttonVar != null) {
            jceOutputStream.write((JceStruct) s_buttonVar, 33);
        }
        jceOutputStream.write(this.video_click_type, 34);
        String str9 = this.header_desc;
        if (str9 != null) {
            jceOutputStream.write(str9, 35);
        }
        ArrayList<s_videourl> arrayList2 = this.video_rate_list;
        if (arrayList2 != null) {
            jceOutputStream.write((Collection) arrayList2, 36);
        }
        jceOutputStream.write(this.cur_video_rate, 37);
        String str10 = this.albumid;
        if (str10 != null) {
            jceOutputStream.write(str10, 38);
        }
        jceOutputStream.write(this.anonymity, 39);
        String str11 = this.video_desc;
        if (str11 != null) {
            jceOutputStream.write(str11, 40);
        }
        jceOutputStream.write(this.video_max_playtime, 41);
        jceOutputStream.write(this.needShowFollowGuideAnimation, 42);
        String str12 = this.afterLayerJumpUrl;
        if (str12 != null) {
            jceOutputStream.write(str12, 43);
        }
    }

    public cell_video(String str, String str2, Map<Integer, s_picurl> map, int i15, String str3, String str4, int i16, byte b15, long j15, Map<Integer, s_videourl> map2, byte b16, int i17, String str5, Map<String, String> map3, s_videoremark s_videoremarkVar, int i18, boolean z15, int i19, String str6, String str7, int i25, int i26, boolean z16, int i27, String str8, boolean z17, boolean z18, int i28, ArrayList<Map<Integer, s_picurl>> arrayList, int i29, Map<Integer, s_picurl> map4, s_weishi s_weishiVar, s_kingcard s_kingcardVar, s_button s_buttonVar, int i35, String str9, ArrayList<s_videourl> arrayList2, int i36, String str10, int i37, String str11, long j16, int i38, String str12) {
        this.videoid = str;
        this.videourl = str2;
        this.coverurl = map;
        this.actiontype = i15;
        this.actionurl = str3;
        this.clientkey = str4;
        this.filetype = i16;
        this.videotype = b15;
        this.videotime = j15;
        this.videourls = map2;
        this.playtype = b16;
        this.videostatus = i17;
        this.toast = str5;
        this.extendinfo = map3;
        this.videoremark = s_videoremarkVar;
        this.video_show_type = i18;
        this.isPanorama = z15;
        this.video_source = i19;
        this.sloc = str6;
        this.lloc = str7;
        this.report_video_feeds_type = i25;
        this.videoplaycnt = i26;
        this.is_share = z16;
        this.adv_delay_time = i27;
        this.video_webview_url = str8;
        this.isOnWifiPlay = z17;
        this.isHadSetPlayOnWifi = z18;
        this.auto_refresh_second = i28;
        this.vcCovers = arrayList;
        this.video_form = i29;
        this.gaussPicUrl = map4;
        this.weishi = s_weishiVar;
        this.stKingCard = s_kingcardVar;
        this.bottom_button = s_buttonVar;
        this.video_click_type = i35;
        this.header_desc = str9;
        this.video_rate_list = arrayList2;
        this.cur_video_rate = i36;
        this.albumid = str10;
        this.anonymity = i37;
        this.video_desc = str11;
        this.video_max_playtime = j16;
        this.needShowFollowGuideAnimation = i38;
        this.afterLayerJumpUrl = str12;
    }
}