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
public final class s_commment extends JceStruct {
    static s_audio cache_audio;
    static Map<String, byte[]> cache_binaryExtInfo;
    static ArrayList<s_picdata> cache_commentpic;
    static Map<String, String> cache_extendInfo;
    static ArrayList<s_likeman> cache_likemans;
    static ArrayList<s_picdata> cache_picdata;
    public s_audio audio;
    public Map<String, byte[]> binaryExtInfo;
    public String commentLikekey;
    public String commentid;
    public ArrayList<s_picdata> commentpic;
    public String content;
    public int date;
    public int displayflag;
    public Map<String, String> extendInfo;
    public int floor;
    public int iDisplayReplyNum;
    public boolean isDeleted;
    public int isEssence;
    public int isPrivate;
    public int isStickTop;
    public int isliked;
    public int likeNum;
    public ArrayList<s_likeman> likemans;
    public ArrayList<s_picdata> picdata;
    public int pokeLikeCount;
    public String pokeLikeEmotion;
    public String refer;
    public int replynum;
    public ArrayList<s_reply> replys;
    public s_user user;
    static s_user cache_user = new s_user();
    static ArrayList<s_reply> cache_replys = new ArrayList<>();

    static {
        cache_replys.add(new s_reply());
        cache_picdata = new ArrayList<>();
        cache_picdata.add(new s_picdata());
        cache_audio = new s_audio();
        cache_commentpic = new ArrayList<>();
        cache_commentpic.add(new s_picdata());
        HashMap map = new HashMap();
        cache_extendInfo = map;
        map.put("", "");
        cache_likemans = new ArrayList<>();
        cache_likemans.add(new s_likeman());
        HashMap map2 = new HashMap();
        cache_binaryExtInfo = map2;
        map2.put("", new byte[]{0});
    }

    public s_commment() {
        this.commentid = "";
        this.user = null;
        this.content = "";
        this.date = 0;
        this.refer = "";
        this.replys = null;
        this.replynum = 0;
        this.picdata = null;
        this.audio = null;
        this.commentpic = null;
        this.floor = 0;
        this.isPrivate = 0;
        this.isEssence = 0;
        this.isDeleted = false;
        this.extendInfo = null;
        this.likeNum = 0;
        this.commentLikekey = "";
        this.isliked = 0;
        this.isStickTop = 0;
        this.displayflag = 0;
        this.iDisplayReplyNum = 0;
        this.likemans = null;
        this.binaryExtInfo = null;
        this.pokeLikeEmotion = "";
        this.pokeLikeCount = 0;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.commentid;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        s_user s_userVar = this.user;
        if (s_userVar != null) {
            jceOutputStream.write((JceStruct) s_userVar, 1);
        }
        String str2 = this.content;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        jceOutputStream.write(this.date, 3);
        String str3 = this.refer;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
        ArrayList<s_reply> arrayList = this.replys;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 5);
        }
        jceOutputStream.write(this.replynum, 6);
        ArrayList<s_picdata> arrayList2 = this.picdata;
        if (arrayList2 != null) {
            jceOutputStream.write((Collection) arrayList2, 7);
        }
        s_audio s_audioVar = this.audio;
        if (s_audioVar != null) {
            jceOutputStream.write((JceStruct) s_audioVar, 8);
        }
        ArrayList<s_picdata> arrayList3 = this.commentpic;
        if (arrayList3 != null) {
            jceOutputStream.write((Collection) arrayList3, 9);
        }
        jceOutputStream.write(this.floor, 10);
        jceOutputStream.write(this.isPrivate, 11);
        jceOutputStream.write(this.isEssence, 12);
        jceOutputStream.write(this.isDeleted, 13);
        Map<String, String> map = this.extendInfo;
        if (map != null) {
            jceOutputStream.write((Map) map, 14);
        }
        jceOutputStream.write(this.likeNum, 15);
        String str4 = this.commentLikekey;
        if (str4 != null) {
            jceOutputStream.write(str4, 16);
        }
        jceOutputStream.write(this.isliked, 17);
        jceOutputStream.write(this.isStickTop, 18);
        jceOutputStream.write(this.displayflag, 19);
        jceOutputStream.write(this.iDisplayReplyNum, 20);
        ArrayList<s_likeman> arrayList4 = this.likemans;
        if (arrayList4 != null) {
            jceOutputStream.write((Collection) arrayList4, 21);
        }
        Map<String, byte[]> map2 = this.binaryExtInfo;
        if (map2 != null) {
            jceOutputStream.write((Map) map2, 22);
        }
        String str5 = this.pokeLikeEmotion;
        if (str5 != null) {
            jceOutputStream.write(str5, 23);
        }
        jceOutputStream.write(this.pokeLikeCount, 24);
    }

    public s_commment(String str, s_user s_userVar, String str2, int i15, String str3, ArrayList<s_reply> arrayList, int i16, ArrayList<s_picdata> arrayList2, s_audio s_audioVar, ArrayList<s_picdata> arrayList3, int i17, int i18, int i19, boolean z15, Map<String, String> map, int i25, String str4, int i26, int i27, int i28, int i29, ArrayList<s_likeman> arrayList4, Map<String, byte[]> map2, String str5, int i35) {
        this.commentid = str;
        this.user = s_userVar;
        this.content = str2;
        this.date = i15;
        this.refer = str3;
        this.replys = arrayList;
        this.replynum = i16;
        this.picdata = arrayList2;
        this.audio = s_audioVar;
        this.commentpic = arrayList3;
        this.floor = i17;
        this.isPrivate = i18;
        this.isEssence = i19;
        this.isDeleted = z15;
        this.extendInfo = map;
        this.likeNum = i25;
        this.commentLikekey = str4;
        this.isliked = i26;
        this.isStickTop = i27;
        this.displayflag = i28;
        this.iDisplayReplyNum = i29;
        this.likemans = arrayList4;
        this.binaryExtInfo = map2;
        this.pokeLikeEmotion = str5;
        this.pokeLikeCount = i35;
    }
}