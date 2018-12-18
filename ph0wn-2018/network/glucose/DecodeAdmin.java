import java.io.*;
import java.util.Base64;

public class DecodeAdmin {
    public static final byte KEY1 = 52;
    public static final byte KEY2 = 0x75;

    public DecodeAdmin() {
    }

    public static String a(String arg4) {
        int v0 = arg4.length();
        char[] v1 = new char[v0];
        --v0;
        while(v0 >= 0) {
            int v2 = v0 - 1;
            v1[v0] = ((char)(arg4.charAt(v0) ^ 52));
            if(v2 < 0) {
            }
            else {
                v0 = v2 - 1;
                v1[v2] = ((char)(arg4.charAt(v2) ^ 0x75));
                continue;
            }

            break;
        }

        return new String(v1);
    }

    public static String decode(String arg2) {
	
        return DecodeAdmin.a(new String(Base64.getDecoder().decode(arg2.getBytes())));
    }

    public static void main(String [] args) {
	System.out.println("1st part decoding: "+DecodeAdmin.decode("VRFZHFo="));
	System.out.println("2nd part decoding: "+DecodeAdmin.decode("JkESVQcFBnYUVRRVFFUUUA=="));
    }


}
