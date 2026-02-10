package NS_MOBILE_PHOTO;

import NS_MOBILE_FEEDS.cell_colorful_tail;
import NS_MOBILE_FEEDS.cell_video;
import NS_MOBILE_FEEDS.stFaceItem;
import NS_MOBILE_FEEDS.stPhotoTag;
import NS_MOBILE_FEEDS.stPoi;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import photo_share_struct.pic_host;

/* loaded from: classes7.dex */
public final class Photo extends JceStruct {
    static Map<String, byte[]> cache_binaryExtInfo;
    static Map<Integer, String> cache_busi_param = new HashMap();
    static stFaceInfo cache_face_info;
    static ArrayList<stFaceItem> cache_facelist;
    static stLabelInfo cache_label_info;
    static Map<Integer, String> cache_mapExifInfo;
    static Map<String, String> cache_mapExtern;
    static Map<Integer, String> cache_mapOcrInfo;
    static cell_colorful_tail cache_material_info;
    static ArrayList<stPhotoTag> cache_photoTag;
    static pic_host cache_pic_host_nick;
    static Map<Integer, Integer> cache_pics_enlargerate;
    static s_outshare cache_share_info;
    static stPoi cache_shoot_place_info;
    static Map<Integer, String> cache_shouzhang_extend_map;
    static cell_video cache_videodata;
    public String albumid;
    public String bigurl;
    public Map<String, byte[]> binaryExtInfo;
    public Map<Integer, String> busi_param;
    public String client_key;
    public int cmtnum;
    public String curkey;
    public String currenturl;
    public String desc;
    public String downloadURL;
    public stFaceInfo face_info;
    public ArrayList<stFaceItem> facelist;
    public int flag;
    public int height;
    public int isIndependentUgc;
    public boolean is_show_repair;
    public stLabelInfo label_info;
    public int likenum;
    public String lloc;
    public Map<Integer, String> mapExifInfo;
    public Map<String, String> mapExtern;
    public Map<Integer, String> mapOcrInfo;
    public cell_colorful_tail material_info;
    public String midurl;
    public int modifytime;
    public byte mylike;
    public String name;
    public byte opmask;
    public int opsynflag;
    public long origin_size;
    public ArrayList<stPhotoTag> photoTag;
    public String photo_visitor_ugc_key;
    public pic_host pic_host_nick;
    public Map<Integer, Integer> pics_enlargerate;
    public int quanflag;
    public long raw;
    public long raw_height;
    public long raw_width;
    public s_outshare share_info;
    public stPoi shoot_place_info;
    public int shoottime;
    public Map<Integer, String> shouzhang_extend_map;
    public String sloc;
    public String smallurl;
    public String thumburl;
    public int trannum;
    public int type;
    public long uin;
    public String unikey;
    public int uploadtime;
    public String url;
    public cell_video videodata;
    public int videoflag;
    public long view_count;
    public int width;

    static {
        cache_busi_param.put(0, "");
        cache_pics_enlargerate = new HashMap();
        cache_pics_enlargerate.put(0, 0);
        cache_photoTag = new ArrayList<>();
        cache_photoTag.add(new stPhotoTag());
        cache_videodata = new cell_video();
        cache_pic_host_nick = new pic_host();
        cache_share_info = new s_outshare();
        cache_shoot_place_info = new stPoi();
        cache_face_info = new stFaceInfo();
        cache_label_info = new stLabelInfo();
        cache_facelist = new ArrayList<>();
        cache_facelist.add(new stFaceItem());
        cache_mapExifInfo = new HashMap();
        cache_mapExifInfo.put(0, "");
        cache_mapOcrInfo = new HashMap();
        cache_mapOcrInfo.put(0, "");
        HashMap map = new HashMap();
        cache_mapExtern = map;
        map.put("", "");
        HashMap map2 = new HashMap();
        cache_binaryExtInfo = map2;
        map2.put("", new byte[]{0});
        cache_shouzhang_extend_map = new HashMap();
        cache_shouzhang_extend_map.put(0, "");
        cache_material_info = new cell_colorful_tail();
    }

    public Photo() {
        this.uin = 0L;
        this.lloc = "";
        this.sloc = "";
        this.name = "";
        this.desc = "";
        this.uploadtime = 0;
        this.modifytime = 0;
        this.width = 0;
        this.height = 0;
        this.url = "";
        this.bigurl = "";
        this.smallurl = "";
        this.cmtnum = 0;
        this.likenum = 0;
        this.mylike = (byte) 0;
        this.trannum = 0;
        this.unikey = "";
        this.curkey = "";
        this.midurl = "";
        this.thumburl = "";
        this.busi_param = null;
        this.type = 0;
        this.isIndependentUgc = 0;
        this.opsynflag = 0;
        this.quanflag = 0;
        this.raw = 0L;
        this.currenturl = "";
        this.pics_enlargerate = null;
        this.photoTag = null;
        this.opmask = (byte) 7;
        this.shoottime = 0;
        this.flag = 0;
        this.albumid = "";
        this.videoflag = 0;
        this.videodata = null;
        this.pic_host_nick = null;
        this.share_info = null;
        this.view_count = 0L;
        this.photo_visitor_ugc_key = "";
        this.client_key = "";
        this.shoot_place_info = null;
        this.face_info = null;
        this.label_info = null;
        this.facelist = null;
        this.origin_size = 0L;
        this.mapExifInfo = null;
        this.mapOcrInfo = null;
        this.mapExtern = null;
        this.raw_width = 0L;
        this.raw_height = 0L;
        this.binaryExtInfo = null;
        this.shouzhang_extend_map = null;
        this.downloadURL = "";
        this.is_show_repair = false;
        this.material_info = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.uin, 0);
        jceOutputStream.write(this.lloc, 1);
        jceOutputStream.write(this.sloc, 2);
        jceOutputStream.write(this.name, 3);
        jceOutputStream.write(this.desc, 4);
        jceOutputStream.write(this.uploadtime, 5);
        jceOutputStream.write(this.modifytime, 6);
        jceOutputStream.write(this.width, 7);
        jceOutputStream.write(this.height, 8);
        jceOutputStream.write(this.url, 9);
        jceOutputStream.write(this.bigurl, 10);
        jceOutputStream.write(this.smallurl, 11);
        jceOutputStream.write(this.cmtnum, 12);
        jceOutputStream.write(this.likenum, 13);
        jceOutputStream.write(this.mylike, 14);
        jceOutputStream.write(this.trannum, 15);
        String str = this.unikey;
        if (str != null) {
            jceOutputStream.write(str, 16);
        }
        String str2 = this.curkey;
        if (str2 != null) {
            jceOutputStream.write(str2, 17);
        }
        String str3 = this.midurl;
        if (str3 != null) {
            jceOutputStream.write(str3, 18);
        }
        String str4 = this.thumburl;
        if (str4 != null) {
            jceOutputStream.write(str4, 19);
        }
        Map<Integer, String> map = this.busi_param;
        if (map != null) {
            jceOutputStream.write((Map) map, 20);
        }
        jceOutputStream.write(this.type, 21);
        jceOutputStream.write(this.isIndependentUgc, 22);
        jceOutputStream.write(this.opsynflag, 23);
        jceOutputStream.write(this.quanflag, 24);
        jceOutputStream.write(this.raw, 25);
        String str5 = this.currenturl;
        if (str5 != null) {
            jceOutputStream.write(str5, 26);
        }
        Map<Integer, Integer> map2 = this.pics_enlargerate;
        if (map2 != null) {
            jceOutputStream.write((Map) map2, 27);
        }
        ArrayList<stPhotoTag> arrayList = this.photoTag;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 28);
        }
        jceOutputStream.write(this.opmask, 29);
        jceOutputStream.write(this.shoottime, 30);
        jceOutputStream.write(this.flag, 31);
        String str6 = this.albumid;
        if (str6 != null) {
            jceOutputStream.write(str6, 32);
        }
        jceOutputStream.write(this.videoflag, 33);
        cell_video cell_videoVar = this.videodata;
        if (cell_videoVar != null) {
            jceOutputStream.write((JceStruct) cell_videoVar, 34);
        }
        pic_host pic_hostVar = this.pic_host_nick;
        if (pic_hostVar != null) {
            jceOutputStream.write((JceStruct) pic_hostVar, 35);
        }
        s_outshare s_outshareVar = this.share_info;
        if (s_outshareVar != null) {
            jceOutputStream.write((JceStruct) s_outshareVar, 36);
        }
        jceOutputStream.write(this.view_count, 37);
        String str7 = this.photo_visitor_ugc_key;
        if (str7 != null) {
            jceOutputStream.write(str7, 38);
        }
        String str8 = this.client_key;
        if (str8 != null) {
            jceOutputStream.write(str8, 39);
        }
        stPoi stpoi = this.shoot_place_info;
        if (stpoi != null) {
            jceOutputStream.write((JceStruct) stpoi, 40);
        }
        stFaceInfo stfaceinfo = this.face_info;
        if (stfaceinfo != null) {
            jceOutputStream.write((JceStruct) stfaceinfo, 41);
        }
        stLabelInfo stlabelinfo = this.label_info;
        if (stlabelinfo != null) {
            jceOutputStream.write((JceStruct) stlabelinfo, 42);
        }
        ArrayList<stFaceItem> arrayList2 = this.facelist;
        if (arrayList2 != null) {
            jceOutputStream.write((Collection) arrayList2, 43);
        }
        jceOutputStream.write(this.origin_size, 44);
        Map<Integer, String> map3 = this.mapExifInfo;
        if (map3 != null) {
            jceOutputStream.write((Map) map3, 45);
        }
        Map<Integer, String> map4 = this.mapOcrInfo;
        if (map4 != null) {
            jceOutputStream.write((Map) map4, 46);
        }
        Map<String, String> map5 = this.mapExtern;
        if (map5 != null) {
            jceOutputStream.write((Map) map5, 47);
        }
        jceOutputStream.write(this.raw_width, 48);
        jceOutputStream.write(this.raw_height, 49);
        Map<String, byte[]> map6 = this.binaryExtInfo;
        if (map6 != null) {
            jceOutputStream.write((Map) map6, 50);
        }
        Map<Integer, String> map7 = this.shouzhang_extend_map;
        if (map7 != null) {
            jceOutputStream.write((Map) map7, 51);
        }
        String str9 = this.downloadURL;
        if (str9 != null) {
            jceOutputStream.write(str9, 52);
        }
        jceOutputStream.write(this.is_show_repair, 53);
        cell_colorful_tail cell_colorful_tailVar = this.material_info;
        if (cell_colorful_tailVar != null) {
            jceOutputStream.write((JceStruct) cell_colorful_tailVar, 54);
        }
    }

    public Photo(long j15, String str, String str2, String str3, String str4, int i15, int i16, int i17, int i18, String str5, String str6, String str7, int i19, int i25, byte b15, int i26, String str8, String str9, String str10, String str11, Map<Integer, String> map, int i27, int i28, int i29, int i35, long j16, String str12, Map<Integer, Integer> map2, ArrayList<stPhotoTag> arrayList, byte b16, int i36, int i37, String str13, int i38, cell_video cell_videoVar, pic_host pic_hostVar, s_outshare s_outshareVar, long j17, String str14, String str15, stPoi stpoi, stFaceInfo stfaceinfo, stLabelInfo stlabelinfo, ArrayList<stFaceItem> arrayList2, long j18, Map<Integer, String> map3, Map<Integer, String> map4, Map<String, String> map5, long j19, long j25, Map<String, byte[]> map6, Map<Integer, String> map7, String str16, boolean z15, cell_colorful_tail cell_colorful_tailVar) {
        this.uin = j15;
        this.lloc = str;
        this.sloc = str2;
        this.name = str3;
        this.desc = str4;
        this.uploadtime = i15;
        this.modifytime = i16;
        this.width = i17;
        this.height = i18;
        this.url = str5;
        this.bigurl = str6;
        this.smallurl = str7;
        this.cmtnum = i19;
        this.likenum = i25;
        this.mylike = b15;
        this.trannum = i26;
        this.unikey = str8;
        this.curkey = str9;
        this.midurl = str10;
        this.thumburl = str11;
        this.busi_param = map;
        this.type = i27;
        this.isIndependentUgc = i28;
        this.opsynflag = i29;
        this.quanflag = i35;
        this.raw = j16;
        this.currenturl = str12;
        this.pics_enlargerate = map2;
        this.photoTag = arrayList;
        this.opmask = b16;
        this.shoottime = i36;
        this.flag = i37;
        this.albumid = str13;
        this.videoflag = i38;
        this.videodata = cell_videoVar;
        this.pic_host_nick = pic_hostVar;
        this.share_info = s_outshareVar;
        this.view_count = j17;
        this.photo_visitor_ugc_key = str14;
        this.client_key = str15;
        this.shoot_place_info = stpoi;
        this.face_info = stfaceinfo;
        this.label_info = stlabelinfo;
        this.facelist = arrayList2;
        this.origin_size = j18;
        this.mapExifInfo = map3;
        this.mapOcrInfo = map4;
        this.mapExtern = map5;
        this.raw_width = j19;
        this.raw_height = j25;
        this.binaryExtInfo = map6;
        this.shouzhang_extend_map = map7;
        this.downloadURL = str16;
        this.is_show_repair = z15;
        this.material_info = cell_colorful_tailVar;
    }
}