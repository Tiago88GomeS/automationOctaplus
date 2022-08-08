package pojo;

public class CounterParty {

    private String groupName;
    private int dailyLimit;
    private Boolean automaticFlow;
    private int produtyType;
    private String counterPartyName;
    private String cnpj;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(int dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Boolean getAutomaticFlow() {
        return automaticFlow;
    }

    public void setAutomaticFlow(Boolean automaticFlow) {
        this.automaticFlow = automaticFlow;
    }

    public int getProdutyType() {
        return produtyType;
    }

    public void setProdutyType(int produtyType) {
        this.produtyType = produtyType;
    }

    public String getCounterPartyName() {
        return counterPartyName;
    }

    public void setCounterPartyName(String counterPartyName) {
        this.counterPartyName = counterPartyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
