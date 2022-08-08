package factory;

import pojo.GroupName;

public class GroupNameDataFactory {
    public static GroupName criarUmNovoGroupNameParaRequisicao(){
        GroupName groupNameCadastradoComSucesso = new GroupName();
        groupNameCadastradoComSucesso.setGroupName("groupNameTesteTiago2");
        return groupNameCadastradoComSucesso;
    }
}
