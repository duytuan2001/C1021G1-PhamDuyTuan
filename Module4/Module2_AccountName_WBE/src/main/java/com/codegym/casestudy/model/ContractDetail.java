package com.codegym.casestudy.model;
import javax.persistence.*;
@Entity
public class ContractDetail {
    @Id
    private int contractDetailId;
    private int contractId;
    private int contractServiceId;
    private int quatity;

    public ContractDetail() {
    }

    public ContractDetail(int contractDetailId, int contractId, int contractServiceId, int quatity) {
        this.contractDetailId = contractDetailId;
        this.contractId = contractId;
        this.contractServiceId = contractServiceId;
        this.quatity = quatity;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getContractServiceId() {
        return contractServiceId;
    }

    public void setContractServiceId(int contractServiceId) {
        this.contractServiceId = contractServiceId;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
}
