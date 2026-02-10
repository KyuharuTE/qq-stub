package NS_MOBILE_FEEDS;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import java.util.HashMap;
import java.util.Map;

/* compiled from: P */
/* loaded from: classes7.dex */
public final class s_droplist_option extends JceStruct {
    static Map<String, String> cache_extend_info;
    public int action_detail;
    public int actiontype;
    public Map<String, String> extend_info;
    public String iconurl;
    public String jumpurl;
    public String optext;
    public String pattonID;
    public String reportattach;
    public int reporttype;
    public int reporttypeV2;

    static {
        HashMap map = new HashMap();
        cache_extend_info = map;
        map.put("", "");
    }

    public s_droplist_option() {
        this.iconurl = "";
        this.optext = "";
        this.actiontype = 0;
        this.jumpurl = "";
        this.reporttype = 0;
        this.reportattach = "";
        this.reporttypeV2 = 0;
        this.extend_info = null;
        this.action_detail = 0;
        this.pattonID = "";
    }

    @Override // com.qq.taf.jce.JceStruct
    public void readFrom(JceInputStream jceInputStream) {
        throw new RuntimeException("stub");
    }

    @Override // com.qq.taf.jce.JceStruct
    public void writeTo(JceOutputStream jceOutputStream) {
        String str = this.iconurl;
        if (str != null) {
            jceOutputStream.write(str, 0);
        }
        String str2 = this.optext;
        if (str2 != null) {
            jceOutputStream.write(str2, 1);
        }
        jceOutputStream.write(this.actiontype, 2);
        String str3 = this.jumpurl;
        if (str3 != null) {
            jceOutputStream.write(str3, 3);
        }
        jceOutputStream.write(this.reporttype, 4);
        String str4 = this.reportattach;
        if (str4 != null) {
            jceOutputStream.write(str4, 5);
        }
        jceOutputStream.write(this.reporttypeV2, 6);
        Map<String, String> map = this.extend_info;
        if (map != null) {
            jceOutputStream.write((Map) map, 7);
        }
        jceOutputStream.write(this.action_detail, 8);
        String str5 = this.pattonID;
        if (str5 != null) {
            jceOutputStream.write(str5, 9);
        }
    }

    public s_droplist_option(String str, String str2, int i15, String str3, int i16, String str4, int i17, Map<String, String> map, int i18, String str5) {
        this.iconurl = str;
        this.optext = str2;
        this.actiontype = i15;
        this.jumpurl = str3;
        this.reporttype = i16;
        this.reportattach = str4;
        this.reporttypeV2 = i17;
        this.extend_info = map;
        this.action_detail = i18;
        this.pattonID = str5;
    }
}