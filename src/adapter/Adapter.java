package adapter;

public class Adapter implements ClientInterface {
    private final LegacyService legacyService = new LegacyService();

    public String fetchData() {
        return legacyService.fetchData().substring(3);
    }
}
