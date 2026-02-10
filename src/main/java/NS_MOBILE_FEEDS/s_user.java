package NS_MOBILE_FEEDS;

import NS_MOBILE_COMM.combine_diamond_info;
import NS_MOBILE_COMM.star_info;
import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: P */
/* loaded from: classes5.dex */
public final class s_user extends JceStruct {
    static s_medal cache_authqzoneMedalInfo;
    static s_kuolie_info cache_kuoliestate;
    static s_medal cache_liveshowMedalInfo;
    static ArrayList<s_nameplate> cache_nameplateList;
    static s_openid_user cache_openid_users;
    static byte[] cache_tmall_deco;
    static ArrayList<String> cache_user_tags;
    public int actiontype;
    public String actionurl;
    public int age;
    public s_medal authqzoneMedalInfo;
    public String avatarRecomBar;
    public byte[] decoration;
    public String descicon;
    public int displayflag;
    public long eUserTypeReport;
    public int from;
    public int iCurUserType;
    public int iVipActType;
    public int icon_height;
    public int icon_width;
    public byte isAnnualVip;
    public int isCmtVerifyOpen;
    public int isFamousWhite;
    public int isPrivateMode;
    public int isQzoneUser;
    public byte isSafeModeUser;
    public byte isSetNickGlint;
    public int isSweetVip;
    public int isVideoCircleVUser;
    public int is_own;
    public int is_owner;
    public s_kuolie_info kuoliestate;
    public int level;
    public s_medal liveshowMedalInfo;
    public String logo;
    public s_medal medalInfo;
    public int namePlate;
    public ArrayList<s_nameplate> nameplateList;
    public String nickname;
    public s_openid_user openid_users;
    public int operation_mask;
    public int portrait_id;
    public String qzonedesc;
    public String qzonedesc_token;
    public byte sex;
    public String strPortraitId;
    public combine_diamond_info stuCombineDiamondInfo;
    public star_info stuStarInfo;
    public ArrayList<s_yytag> tagInfos;
    public String talk_id;
    public int timestamp;
    public byte[] tmall_deco;
    public long uFansCount;
    public long uFeedsCount;
    public long uVisitorCount;
    public String uid;
    public long uin;
    public String uinkey;
    public String under_nickname_desc;
    public ArrayList<String> user_tags;
    public int vip;
    public byte vipShowType;
    public int viplevel;
    public int viptype;
    public long vtime;
    static s_medal cache_medalInfo = new s_medal();
    static star_info cache_stuStarInfo = new star_info();
    static combine_diamond_info cache_stuCombineDiamondInfo = new combine_diamond_info();
    static byte[] cache_decoration = {0};
    static ArrayList<s_yytag> cache_tagInfos = new ArrayList<>();

    static {
        cache_tagInfos.add(new s_yytag());
        cache_liveshowMedalInfo = new s_medal();
        cache_authqzoneMedalInfo = new s_medal();
        cache_openid_users = new s_openid_user();
        cache_kuoliestate = new s_kuolie_info();
        ArrayList<String> arrayList = new ArrayList<>();
        cache_user_tags = arrayList;
        arrayList.add("");
        cache_nameplateList = new ArrayList<>();
        cache_nameplateList.add(new s_nameplate());
        cache_tmall_deco = new byte[]{0};
    }

    public s_user() {
        this.uin = 0L;
        this.nickname = "";
        this.timestamp = 0;
        this.from = 1;
        this.uinkey = "";
        this.logo = "";
        this.vip = 0;
        this.level = 0;
        this.viplevel = 0;
        this.viptype = 0;
        this.qzonedesc = "";
        this.is_owner = 0;
        this.operation_mask = 0;
        this.uid = "";
        this.talk_id = "";
        this.portrait_id = 0;
        this.is_own = 0;
        this.isFamousWhite = 0;
        this.isQzoneUser = 0;
        this.isAnnualVip = (byte) 0;
        this.isSetNickGlint = (byte) 0;
        this.medalInfo = null;
        this.descicon = "";
        this.icon_width = 0;
        this.icon_height = 0;
        this.isSweetVip = 0;
        this.stuStarInfo = null;
        this.stuCombineDiamondInfo = null;
        this.isSafeModeUser = (byte) 0;
        this.vipShowType = (byte) -1;
        this.namePlate = 0;
        this.actiontype = 0;
        this.actionurl = "";
        this.decoration = null;
        this.tagInfos = null;
        this.strPortraitId = "";
        this.under_nickname_desc = "";
        this.liveshowMedalInfo = null;
        this.uFansCount = 0L;
        this.uVisitorCount = 0L;
        this.isCmtVerifyOpen = 0;
        this.iCurUserType = 0;
        this.displayflag = 0;
        this.vtime = 0L;
        this.authqzoneMedalInfo = null;
        this.eUserTypeReport = 0L;
        this.iVipActType = 0;
        this.openid_users = null;
        this.sex = (byte) 0;
        this.kuoliestate = null;
        this.isPrivateMode = 0;
        this.avatarRecomBar = "";
        this.user_tags = null;
        this.age = 0;
        this.isVideoCircleVUser = 0;
        this.uFeedsCount = 0L;
        this.qzonedesc_token = "";
        this.nameplateList = null;
        this.tmall_deco = null;
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.uin, 0);
        String str = this.nickname;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.timestamp, 2);
        jceOutputStream.write(this.from, 3);
        String str2 = this.uinkey;
        if (str2 != null) {
            jceOutputStream.write(str2, 4);
        }
        String str3 = this.logo;
        if (str3 != null) {
            jceOutputStream.write(str3, 5);
        }
        jceOutputStream.write(this.vip, 6);
        jceOutputStream.write(this.level, 7);
        jceOutputStream.write(this.viplevel, 8);
        jceOutputStream.write(this.viptype, 9);
        String str4 = this.qzonedesc;
        if (str4 != null) {
            jceOutputStream.write(str4, 10);
        }
        jceOutputStream.write(this.is_owner, 11);
        jceOutputStream.write(this.operation_mask, 12);
        String str5 = this.uid;
        if (str5 != null) {
            jceOutputStream.write(str5, 13);
        }
        String str6 = this.talk_id;
        if (str6 != null) {
            jceOutputStream.write(str6, 14);
        }
        jceOutputStream.write(this.portrait_id, 15);
        jceOutputStream.write(this.is_own, 16);
        jceOutputStream.write(this.isFamousWhite, 17);
        jceOutputStream.write(this.isQzoneUser, 18);
        jceOutputStream.write(this.isAnnualVip, 19);
        jceOutputStream.write(this.isSetNickGlint, 20);
        s_medal s_medalVar = this.medalInfo;
        if (s_medalVar != null) {
            jceOutputStream.write((JceStruct) s_medalVar, 21);
        }
        String str7 = this.descicon;
        if (str7 != null) {
            jceOutputStream.write(str7, 22);
        }
        jceOutputStream.write(this.icon_width, 23);
        jceOutputStream.write(this.icon_height, 24);
        jceOutputStream.write(this.isSweetVip, 25);
        star_info star_infoVar = this.stuStarInfo;
        if (star_infoVar != null) {
            jceOutputStream.write((JceStruct) star_infoVar, 26);
        }
        combine_diamond_info combine_diamond_infoVar = this.stuCombineDiamondInfo;
        if (combine_diamond_infoVar != null) {
            jceOutputStream.write((JceStruct) combine_diamond_infoVar, 27);
        }
        jceOutputStream.write(this.isSafeModeUser, 28);
        jceOutputStream.write(this.vipShowType, 29);
        jceOutputStream.write(this.namePlate, 30);
        jceOutputStream.write(this.actiontype, 31);
        String str8 = this.actionurl;
        if (str8 != null) {
            jceOutputStream.write(str8, 32);
        }
        byte[] bArr = this.decoration;
        if (bArr != null) {
            jceOutputStream.write(bArr, 33);
        }
        ArrayList<s_yytag> arrayList = this.tagInfos;
        if (arrayList != null) {
            jceOutputStream.write((Collection) arrayList, 34);
        }
        String str9 = this.strPortraitId;
        if (str9 != null) {
            jceOutputStream.write(str9, 35);
        }
        String str10 = this.under_nickname_desc;
        if (str10 != null) {
            jceOutputStream.write(str10, 36);
        }
        s_medal s_medalVar2 = this.liveshowMedalInfo;
        if (s_medalVar2 != null) {
            jceOutputStream.write((JceStruct) s_medalVar2, 37);
        }
        jceOutputStream.write(this.uFansCount, 38);
        jceOutputStream.write(this.uVisitorCount, 39);
        jceOutputStream.write(this.isCmtVerifyOpen, 40);
        jceOutputStream.write(this.iCurUserType, 41);
        jceOutputStream.write(this.displayflag, 42);
        jceOutputStream.write(this.vtime, 43);
        s_medal s_medalVar3 = this.authqzoneMedalInfo;
        if (s_medalVar3 != null) {
            jceOutputStream.write((JceStruct) s_medalVar3, 44);
        }
        jceOutputStream.write(this.eUserTypeReport, 45);
        jceOutputStream.write(this.iVipActType, 46);
        s_openid_user s_openid_userVar = this.openid_users;
        if (s_openid_userVar != null) {
            jceOutputStream.write((JceStruct) s_openid_userVar, 47);
        }
        jceOutputStream.write(this.sex, 48);
        s_kuolie_info s_kuolie_infoVar = this.kuoliestate;
        if (s_kuolie_infoVar != null) {
            jceOutputStream.write((JceStruct) s_kuolie_infoVar, 49);
        }
        jceOutputStream.write(this.isPrivateMode, 50);
        String str11 = this.avatarRecomBar;
        if (str11 != null) {
            jceOutputStream.write(str11, 51);
        }
        ArrayList<String> arrayList2 = this.user_tags;
        if (arrayList2 != null) {
            jceOutputStream.write((Collection) arrayList2, 52);
        }
        jceOutputStream.write(this.age, 53);
        jceOutputStream.write(this.isVideoCircleVUser, 54);
        jceOutputStream.write(this.uFeedsCount, 55);
        String str12 = this.qzonedesc_token;
        if (str12 != null) {
            jceOutputStream.write(str12, 56);
        }
        ArrayList<s_nameplate> arrayList3 = this.nameplateList;
        if (arrayList3 != null) {
            jceOutputStream.write((Collection) arrayList3, 57);
        }
        byte[] bArr2 = this.tmall_deco;
        if (bArr2 != null) {
            jceOutputStream.write(bArr2, 58);
        }
    }

    public s_user(long j15, String str, int i15, int i16, String str2, String str3, int i17, int i18, int i19, int i25, String str4, int i26, int i27, String str5, String str6, int i28, int i29, int i35, int i36, byte b15, byte b16, s_medal s_medalVar, String str7, int i37, int i38, int i39, star_info star_infoVar, combine_diamond_info combine_diamond_infoVar, byte b17, byte b18, int i45, int i46, String str8, byte[] bArr, ArrayList<s_yytag> arrayList, String str9, String str10, s_medal s_medalVar2, long j16, long j17, int i47, int i48, int i49, long j18, s_medal s_medalVar3, long j19, int i55, s_openid_user s_openid_userVar, byte b19, s_kuolie_info s_kuolie_infoVar, int i56, String str11, ArrayList<String> arrayList2, int i57, int i58, long j25, String str12, ArrayList<s_nameplate> arrayList3, byte[] bArr2) {
        this.uin = j15;
        this.nickname = str;
        this.timestamp = i15;
        this.from = i16;
        this.uinkey = str2;
        this.logo = str3;
        this.vip = i17;
        this.level = i18;
        this.viplevel = i19;
        this.viptype = i25;
        this.qzonedesc = str4;
        this.is_owner = i26;
        this.operation_mask = i27;
        this.uid = str5;
        this.talk_id = str6;
        this.portrait_id = i28;
        this.is_own = i29;
        this.isFamousWhite = i35;
        this.isQzoneUser = i36;
        this.isAnnualVip = b15;
        this.isSetNickGlint = b16;
        this.medalInfo = s_medalVar;
        this.descicon = str7;
        this.icon_width = i37;
        this.icon_height = i38;
        this.isSweetVip = i39;
        this.stuStarInfo = star_infoVar;
        this.stuCombineDiamondInfo = combine_diamond_infoVar;
        this.isSafeModeUser = b17;
        this.vipShowType = b18;
        this.namePlate = i45;
        this.actiontype = i46;
        this.actionurl = str8;
        this.decoration = bArr;
        this.tagInfos = arrayList;
        this.strPortraitId = str9;
        this.under_nickname_desc = str10;
        this.liveshowMedalInfo = s_medalVar2;
        this.uFansCount = j16;
        this.uVisitorCount = j17;
        this.isCmtVerifyOpen = i47;
        this.iCurUserType = i48;
        this.displayflag = i49;
        this.vtime = j18;
        this.authqzoneMedalInfo = s_medalVar3;
        this.eUserTypeReport = j19;
        this.iVipActType = i55;
        this.openid_users = s_openid_userVar;
        this.sex = b19;
        this.kuoliestate = s_kuolie_infoVar;
        this.isPrivateMode = i56;
        this.avatarRecomBar = str11;
        this.user_tags = arrayList2;
        this.age = i57;
        this.isVideoCircleVUser = i58;
        this.uFeedsCount = j25;
        this.qzonedesc_token = str12;
        this.nameplateList = arrayList3;
        this.tmall_deco = bArr2;
    }
}