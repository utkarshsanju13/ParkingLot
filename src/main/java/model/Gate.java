package model;

import model.enums.GateStatus;
import model.enums.GateType;

public class Gate extends BaseModel {

    private int gateNumber;
    private GateType gateType;
    private GateStatus status;
    private String operatorName;

    public Gate() {
    }

    public Gate(int gateNumber, GateType gateType, GateStatus status, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.status = status;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "gateNumber=" + gateNumber +
                ", gateType=" + gateType +
                ", status=" + status +
                ", operatorName='" + operatorName + '\'' +
                '}';
    }
}
