package NS_MOBILE_FEEDS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes12.dex */
public final class stFaceItem extends JceStruct {
    static int cache_quanstate;
    static ArrayList<FaceRecommendInfo> cache_recommend_infos = new ArrayList<>();
    public boolean FromSys;
    public String faceUrl;
    public String faceid;
    public String groupid;

    /* renamed from: h, reason: collision with root package name */
    public long f549h;
    public boolean is_recommend;
    public long opertime;
    public String photo_id;
    public String quanid;
    public int quanstate;
    public ArrayList<FaceRecommendInfo> recommend_infos;
    public String target_groupid;
    public String targetnick;
    public long targetuin;

    /* renamed from: w, reason: collision with root package name */
    public long f550w;
    public String writernick;
    public long writeruin;

    /* renamed from: x, reason: collision with root package name */
    public long f551x;

    /* renamed from: y, reason: collision with root package name */
    public long f552y;

    static {
        cache_recommend_infos.add(new FaceRecommendInfo());
    }

    public stFaceItem() {
        this.photo_id = "";
        this.f551x = 0L;
        this.f552y = 0L;
        this.f550w = 0L;
        this.f549h = 0L;
        this.quanstate = 0;
        this.opertime = 0L;
        this.faceid = "";
        this.quanid = "";
        this.targetuin = 0L;
        this.targetnick = "";
        this.writeruin = 0L;
        this.writernick = "";
        this.faceUrl = "";
        this.FromSys = true;
        this.groupid = "";
        this.recommend_infos = null;
        this.target_groupid = "";
        this.is_recommend = false;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        this.photo_id = jceInputStream.readString(0, true);
        this.f551x = jceInputStream.read(this.f551x, 1, true);
        this.f552y = jceInputStream.read(this.f552y, 2, true);
        this.f550w = jceInputStream.read(this.f550w, 3, true);
        this.f549h = jceInputStream.read(this.f549h, 4, true);
        this.quanstate = jceInputStream.read(this.quanstate, 5, true);
        this.opertime = jceInputStream.read(this.opertime, 6, true);
        this.faceid = jceInputStream.readString(7, false);
        this.quanid = jceInputStream.readString(8, false);
        this.targetuin = jceInputStream.read(this.targetuin, 9, false);
        this.targetnick = jceInputStream.readString(10, false);
        this.writeruin = jceInputStream.read(this.writeruin, 11, false);
        this.writernick = jceInputStream.readString(12, false);
        this.faceUrl = jceInputStream.readString(13, false);
        this.FromSys = jceInputStream.read(this.FromSys, 14, false);
        this.groupid = jceInputStream.readString(15, false);
        this.target_groupid = jceInputStream.readString(17, false);
        this.is_recommend = jceInputStream.read(this.is_recommend, 18, false);
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.photo_id, 0);
        jceOutputStream.write(this.f551x, 1);
        jceOutputStream.write(this.f552y, 2);
        jceOutputStream.write(this.f550w, 3);
        jceOutputStream.write(this.f549h, 4);
        jceOutputStream.write(this.quanstate, 5);
        jceOutputStream.write(this.opertime, 6);
        String str = this.faceid;
        if (str != null) {
            jceOutputStream.write(str, 7);
        }
        String str2 = this.quanid;
        if (str2 != null) {
            jceOutputStream.write(str2, 8);
        }
        jceOutputStream.write(this.targetuin, 9);
        String str3 = this.targetnick;
        if (str3 != null) {
            jceOutputStream.write(str3, 10);
        }
        jceOutputStream.write(this.writeruin, 11);
        String str4 = this.writernick;
        if (str4 != null) {
            jceOutputStream.write(str4, 12);
        }
        String str5 = this.faceUrl;
        if (str5 != null) {
            jceOutputStream.write(str5, 13);
        }
        jceOutputStream.write(this.FromSys, 14);
        String str6 = this.groupid;
        if (str6 != null) {
            jceOutputStream.write(str6, 15);
        }
        ArrayList<FaceRecommendInfo> arrayList = this.recommend_infos;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 16);
        }
        String str7 = this.target_groupid;
        if (str7 != null) {
            jceOutputStream.write(str7, 17);
        }
        jceOutputStream.write(this.is_recommend, 18);
    }

    public stFaceItem(String str, long j15, long j16, long j17, long j18, int i15, long j19, String str2, String str3, long j25, String str4, long j26, String str5, String str6, boolean z15, String str7, ArrayList<FaceRecommendInfo> arrayList, String str8, boolean z16) {
        this.photo_id = str;
        this.f551x = j15;
        this.f552y = j16;
        this.f550w = j17;
        this.f549h = j18;
        this.quanstate = i15;
        this.opertime = j19;
        this.faceid = str2;
        this.quanid = str3;
        this.targetuin = j25;
        this.targetnick = str4;
        this.writeruin = j26;
        this.writernick = str5;
        this.faceUrl = str6;
        this.FromSys = z15;
        this.groupid = str7;
        this.recommend_infos = arrayList;
        this.target_groupid = str8;
        this.is_recommend = z16;
    }
}