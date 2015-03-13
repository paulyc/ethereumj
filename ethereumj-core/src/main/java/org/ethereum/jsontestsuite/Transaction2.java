package org.ethereum.jsontestsuite;

import org.json.simple.JSONObject;

import java.math.BigInteger;

import static org.ethereum.util.ByteUtil.toHexString;

/**
 * @author Roman Mandeleil
 * @since 28.06.2014
 */
public class Transaction2 {

    String data;
    String gasLimit;
    String gasPrice;
    String nonce;
    String r;
    String s;
    String to;
    String v;
    String value;


    public Transaction2() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getGasLimit() {
        return gasLimit;
    }

    public void setGasLimit(String gasLimit) {
        this.gasLimit = gasLimit;
    }

    public String getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(String gasPrice) {
        this.gasPrice = gasPrice;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Transaction2{" +
                "data='" + data + '\'' +
                ", gasLimit='" + gasLimit + '\'' +
                ", gasPrice='" + gasPrice + '\'' +
                ", nonce='" + nonce + '\'' +
                ", r='" + r + '\'' +
                ", s='" + s + '\'' +
                ", to='" + to + '\'' +
                ", v='" + v + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
