package factory;

import pojo.CounterParty;
import pojo.GroupName;

public class CounterPartyDataFactory {
    public static CounterParty criarUmNovoCounterParty(){
        GroupName groupNameTest = GroupNameDataFactory.criarUmNovoGroupNameParaRequisicao();
        CounterParty counterParty = new CounterParty();

        counterParty.setCounterPartyName("Tiago Gomes Teste Octaplus");
        counterParty.setCnpj("85853555000139");
        counterParty.setProdutyType(1);
        counterParty.setAutomaticFlow(true);
        counterParty.setDailyLimit(0);
        counterParty.setGroupName(groupNameTest.getGroupName());

        return counterParty;

    }
}

