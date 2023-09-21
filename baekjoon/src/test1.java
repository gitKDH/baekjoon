import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        String[] log = new String[]{
                "1622025201 REQUEST 10001 192.168.0.1",
                "1622025202 REQUEST 10002 192.168.0.2",
                "1622025203 REQUEST 10003 192.168.0.1",
                "1622025211 RESPONSE 10003",
                "1622025212 RESPONSE 10002",
                "1622025213 RESPONSE 10001",
                "1622025221 REQUEST 10004 192.168.0.2",
                "1622025223 REQUEST 10005 192.168.0.2",
                "1622025230 RESPONSE 10004",
                "1622025231 REQUEST 10006 192.168.0.3",
                "1622025236 RESPONSE 10006"
        };
        HashMap<String, Integer> requestCounts = countRequest(log);
        HashMap<String, Long> requestTimes = getRequestTimes(log);

        for (String ip : requestCounts.keySet()) {
            int count = requestCounts.get(ip);
            System.out.println(ip + " (" + count + ")");
        }

        for (String requestId : requestTimes.keySet()) {
            long requestTime = requestTimes.get(requestId);
            String requestTimestamp = getTimestamp(log, "REQUEST", requestId);
            if (requestTime == -1) {
                System.out.println(requestId + " " + requestTimestamp + " FAIL");
            } else {
                System.out.println(requestId + " " + requestTimestamp + " " + requestTime + "sec");
            }
        }
    }

    public static HashMap<String, Integer> countRequest(String[] log) {
        HashMap<String, Integer> requestCounts = new HashMap<>();

        for (String list : log) {
            String[] eachLog = list.split(" ");
            if (eachLog.length >= 4 && eachLog[1].equals("REQUEST")) {
                String ip = eachLog[3];
                requestCounts.put(ip, requestCounts.getOrDefault(ip, 0) + 1);
            }
        }

        return requestCounts;
    }

    public static HashMap<String, Long> getRequestTimes(String[] log) {
        HashMap<String, Long> requestTimes = new HashMap<>();

        HashMap<String, String> requestLogs = new HashMap<>();
        for (String entry : log) {
            String[] parts = entry.split(" ");
            if (parts.length >= 4 && parts[1].equals("REQUEST")) {
                String requestId = parts[2];
                String requestTime = parts[0];
                requestLogs.put(requestId, requestTime);
            } else if (parts.length >= 3 && parts[1].equals("RESPONSE")) {
                String requestId = parts[2];
                String responseTime = parts[0];
                if (requestLogs.containsKey(requestId)) {
                    long duration = Long.parseLong(responseTime) - Long.parseLong(requestLogs.get(requestId));
                    requestTimes.put(requestId, duration);
                    requestLogs.remove(requestId);
                }
            }
        }

        for (String requestId : requestLogs.keySet()) {
            requestTimes.put(requestId, -1L);
        }

        return requestTimes;
    }

    public static String getTimestamp(String[] log, String eventType, String requestId) {
        for (String entry : log) {
            String[] parts = entry.split(" ");
            if (parts.length >= 4 && parts[1].equals(eventType) && parts[2].equals(requestId)) {
                return parts[0];
            }
        }
        return "";
    }
}
