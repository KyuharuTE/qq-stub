package NS_MOBILE_PHOTO;

import NS_MOBILE_FEEDS.s_arkshare;
import NS_MOBILE_MATERIAL.MaterialItem;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import photo_share_struct.client_attr;

/* compiled from: P */
/* loaded from: classes7.dex */
public final class Album extends JceStruct {
    static ArrayList<Long> cache_album_white_list = new ArrayList<>();
    static s_arkshare cache_ark_sharedata;
    static Map<Integer, String> cache_busi_param;
    static ArrayList<TimeEventOp> cache_lover_events;
    static MaterialItem cache_material;
    static int cache_recommend_album_type;
    static s_arkshare cache_share_album_invate_ark;
    static ArrayList<client_attr> cache_shareattrs;
    static int cache_sort_type;
    public ArrayList<Long> album_white_list;
    public String albumid;
    public String albumowner;
    public int allow_share;
    public String answer;
    public s_arkshare ark_sharedata;
    public long birth_day;
    public long birth_month;
    public String birth_nickname;
    public int birth_sexual;
    public long birth_time;
    public long birth_type;
    public long birth_year;
    public String bitmap;
    public Map<Integer, String> busi_param;
    public String coverurl;
    public int createtime;
    public String desc;
    public int game_album_flag;
    public long individual;
    public boolean isSubscribe;
    public int is_allow_share;
    public int is_allow_sharer_upload;
    public boolean is_mood_album;
    public int is_share;
    public int lastuploadtime;
    public long love_time;
    public long love_value;
    public ArrayList<TimeEventOp> lover_events;
    public MaterialItem material;
    public int moditytime;
    public String name;
    public int opmask;
    public long owner;
    public int photo_num;
    public int priv;
    public String question;
    public long recoded_days;
    public int recommend_album_type;
    public s_arkshare share_album_invate_ark;
    public ArrayList<client_attr> shareattrs;
    public int sort_type;
    public long svrtime;
    public int top_flag;
    public int total;
    public int type;
    public long uin;
    public int video_num;

    static {
        cache_album_white_list.add(0L);
        cache_busi_param = new HashMap();
        cache_busi_param.put(0, "");
        cache_material = new MaterialItem();
        cache_shareattrs = new ArrayList<>();
        cache_shareattrs.add(new client_attr());
        cache_lover_events = new ArrayList<>();
        cache_lover_events.add(new TimeEventOp());
        cache_recommend_album_type = 0;
        cache_ark_sharedata = new s_arkshare();
        cache_sort_type = 0;
        cache_share_album_invate_ark = new s_arkshare();
    }

    public Album() {
        this.uin = 0L;
        this.albumid = "";
        this.name = "";
        this.desc = "";
        this.createtime = 0;
        this.moditytime = 0;
        this.lastuploadtime = 0;
        this.priv = 0;
        this.total = 0;
        this.question = "";
        this.answer = "";
        this.allow_share = 0;
        this.album_white_list = null;
        this.svrtime = 0L;
        this.busi_param = null;
        this.birth_time = 0L;
        this.type = 0;
        this.isSubscribe = true;
        this.opmask = 0;
        this.coverurl = "";
        this.bitmap = "";
        this.birth_sexual = 0;
        this.birth_nickname = "";
        this.birth_year = 0L;
        this.birth_month = 0L;
        this.birth_day = 0L;
        this.birth_type = 0L;
        this.individual = 0L;
        this.material = null;
        this.albumowner = "";
        this.shareattrs = null;
        this.is_share = 0;
        this.owner = 0L;
        this.love_time = 0L;
        this.lover_events = null;
        this.love_value = 0L;
        this.recoded_days = 0L;
        this.video_num = 0;
        this.photo_num = 0;
        this.recommend_album_type = 0;
        this.ark_sharedata = null;
        this.sort_type = 3;
        this.top_flag = 0;
        this.game_album_flag = 0;
        this.is_allow_sharer_upload = 0;
        this.is_allow_share = 0;
        this.share_album_invate_ark = null;
        this.is_mood_album = false;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.uin, 0);
        String str = this.albumid;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        String str2 = this.name;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        String str3 = this.desc;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        jceOutputStream.write(this.createtime, 4);
        jceOutputStream.write(this.moditytime, 5);
        jceOutputStream.write(this.lastuploadtime, 6);
        jceOutputStream.write(this.priv, 7);
        jceOutputStream.write(this.total, 8);
        String str4 = this.question;
        if (str4 != null) {
            jceOutputStream.write(str4, 9);
        }
        String str5 = this.answer;
        if (str5 != null) {
            jceOutputStream.write(str5, 10);
        }
        jceOutputStream.write(this.allow_share, 11);
        ArrayList<Long> arrayList = this.album_white_list;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 12);
        }
        jceOutputStream.write(this.svrtime, 13);
        Map<Integer, String> map = this.busi_param;
        if (map != null) {
            jceOutputStream.write((Map) map, 14);
        }
        jceOutputStream.write(this.birth_time, 15);
        jceOutputStream.write(this.type, 16);
        jceOutputStream.write(this.isSubscribe, 17);
        jceOutputStream.write(this.opmask, 18);
        String str6 = this.coverurl;
        if (str6 != null) {
            jceOutputStream.write(str6, 19);
        }
        String str7 = this.bitmap;
        if (str7 != null) {
            jceOutputStream.write(str7, 20);
        }
        jceOutputStream.write(this.birth_sexual, 21);
        String str8 = this.birth_nickname;
        if (str8 != null) {
            jceOutputStream.write(str8, 22);
        }
        jceOutputStream.write(this.birth_year, 23);
        jceOutputStream.write(this.birth_month, 24);
        jceOutputStream.write(this.birth_day, 25);
        jceOutputStream.write(this.birth_type, 26);
        jceOutputStream.write(this.individual, 27);
        MaterialItem materialItem = this.material;
        if (materialItem != null) {
            jceOutputStream.write((JceStruct) materialItem, 28);
        }
        String str9 = this.albumowner;
        if (str9 != null) {
            jceOutputStream.write(str9, 29);
        }
        ArrayList<client_attr> arrayList2 = this.shareattrs;
        if (arrayList2 != null) {
            jceOutputStream.write((Collection) arrayList2, 30);
        }
        jceOutputStream.write(this.is_share, 31);
        jceOutputStream.write(this.owner, 32);
        jceOutputStream.write(this.love_time, 33);
        ArrayList<TimeEventOp> arrayList3 = this.lover_events;
        if (arrayList3 != null) {
            jceOutputStream.write((Collection) arrayList3, 34);
        }
        jceOutputStream.write(this.love_value, 35);
        jceOutputStream.write(this.recoded_days, 36);
        jceOutputStream.write(this.video_num, 37);
        jceOutputStream.write(this.photo_num, 38);
        jceOutputStream.write(this.recommend_album_type, 39);
        s_arkshare s_arkshareVar = this.ark_sharedata;
        if (s_arkshareVar != null) {
            jceOutputStream.write((JceStruct) s_arkshareVar, 40);
        }
        jceOutputStream.write(this.sort_type, 41);
        jceOutputStream.write(this.top_flag, 42);
        jceOutputStream.write(this.game_album_flag, 43);
        jceOutputStream.write(this.is_allow_sharer_upload, 44);
        jceOutputStream.write(this.is_allow_share, 45);
        s_arkshare s_arkshareVar2 = this.share_album_invate_ark;
        if (s_arkshareVar2 != null) {
            jceOutputStream.write((JceStruct) s_arkshareVar2, 46);
        }
        jceOutputStream.write(this.is_mood_album, 47);
    }

    public Album(long j15, String str, String str2, String str3, int i15, int i16, int i17, int i18, int i19, String str4, String str5, int i25, ArrayList<Long> arrayList, long j16, Map<Integer, String> map, long j17, int i26, boolean z15, int i27, String str6, String str7, int i28, String str8, long j18, long j19, long j25, long j26, long j27, MaterialItem materialItem, String str9, ArrayList<client_attr> arrayList2, int i29, long j28, long j29, ArrayList<TimeEventOp> arrayList3, long j35, long j36, int i35, int i36, int i37, s_arkshare s_arkshareVar, int i38, int i39, int i45, int i46, int i47, s_arkshare s_arkshareVar2, boolean z16) {
        this.uin = j15;
        this.albumid = str;
        this.name = str2;
        this.desc = str3;
        this.createtime = i15;
        this.moditytime = i16;
        this.lastuploadtime = i17;
        this.priv = i18;
        this.total = i19;
        this.question = str4;
        this.answer = str5;
        this.allow_share = i25;
        this.album_white_list = arrayList;
        this.svrtime = j16;
        this.busi_param = map;
        this.birth_time = j17;
        this.type = i26;
        this.isSubscribe = z15;
        this.opmask = i27;
        this.coverurl = str6;
        this.bitmap = str7;
        this.birth_sexual = i28;
        this.birth_nickname = str8;
        this.birth_year = j18;
        this.birth_month = j19;
        this.birth_day = j25;
        this.birth_type = j26;
        this.individual = j27;
        this.material = materialItem;
        this.albumowner = str9;
        this.shareattrs = arrayList2;
        this.is_share = i29;
        this.owner = j28;
        this.love_time = j29;
        this.lover_events = arrayList3;
        this.love_value = j35;
        this.recoded_days = j36;
        this.video_num = i35;
        this.photo_num = i36;
        this.recommend_album_type = i37;
        this.ark_sharedata = s_arkshareVar;
        this.sort_type = i38;
        this.top_flag = i39;
        this.game_album_flag = i45;
        this.is_allow_sharer_upload = i46;
        this.is_allow_share = i47;
        this.share_album_invate_ark = s_arkshareVar2;
        this.is_mood_album = z16;
    }
}