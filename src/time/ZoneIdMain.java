package time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        System.out.println("시스템이 사용하는 ZondID-------------------------------------------");
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        System.out.println("Asia/Seoul의 ZondID-------------------------------------------");
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);


    }
}
