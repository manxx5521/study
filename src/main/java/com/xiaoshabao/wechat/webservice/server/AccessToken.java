
package com.xiaoshabao.wechat.webservice.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>accessToken complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="accessToken"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="appName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="appsecret" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="encodingAESKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="expiresIn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jsaccessToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jsexpiresIn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="jsupdateTime" type="{http://server.webservice.wechat.xiaoshabao.com/}timestamp" minOccurs="0"/&gt;
 *         &lt;element name="updateTime" type="{http://server.webservice.wechat.xiaoshabao.com/}timestamp" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessToken", propOrder = {
    "accessToken",
    "accountId",
    "appName",
    "appid",
    "appsecret",
    "encodingAESKey",
    "expiresIn",
    "id",
    "jsaccessToken",
    "jsexpiresIn",
    "jsupdateTime",
    "updateTime"
})
public class AccessToken {

    protected String accessToken;
    protected Integer accountId;
    protected String appName;
    protected String appid;
    protected String appsecret;
    protected String encodingAESKey;
    protected int expiresIn;
    protected String id;
    protected String jsaccessToken;
    protected int jsexpiresIn;
    protected Timestamp jsupdateTime;
    protected Timestamp updateTime;

    /**
     * ��ȡaccessToken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * ����accessToken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessToken(String value) {
        this.accessToken = value;
    }

    /**
     * ��ȡaccountId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * ����accountId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountId(Integer value) {
        this.accountId = value;
    }

    /**
     * ��ȡappName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppName() {
        return appName;
    }

    /**
     * ����appName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppName(String value) {
        this.appName = value;
    }

    /**
     * ��ȡappid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppid() {
        return appid;
    }

    /**
     * ����appid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppid(String value) {
        this.appid = value;
    }

    /**
     * ��ȡappsecret���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppsecret() {
        return appsecret;
    }

    /**
     * ����appsecret���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppsecret(String value) {
        this.appsecret = value;
    }

    /**
     * ��ȡencodingAESKey���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncodingAESKey() {
        return encodingAESKey;
    }

    /**
     * ����encodingAESKey���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncodingAESKey(String value) {
        this.encodingAESKey = value;
    }

    /**
     * ��ȡexpiresIn���Ե�ֵ��
     * 
     */
    public int getExpiresIn() {
        return expiresIn;
    }

    /**
     * ����expiresIn���Ե�ֵ��
     * 
     */
    public void setExpiresIn(int value) {
        this.expiresIn = value;
    }

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ��ȡjsaccessToken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsaccessToken() {
        return jsaccessToken;
    }

    /**
     * ����jsaccessToken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsaccessToken(String value) {
        this.jsaccessToken = value;
    }

    /**
     * ��ȡjsexpiresIn���Ե�ֵ��
     * 
     */
    public int getJsexpiresIn() {
        return jsexpiresIn;
    }

    /**
     * ����jsexpiresIn���Ե�ֵ��
     * 
     */
    public void setJsexpiresIn(int value) {
        this.jsexpiresIn = value;
    }

    /**
     * ��ȡjsupdateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getJsupdateTime() {
        return jsupdateTime;
    }

    /**
     * ����jsupdateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setJsupdateTime(Timestamp value) {
        this.jsupdateTime = value;
    }

    /**
     * ��ȡupdateTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    /**
     * ����updateTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setUpdateTime(Timestamp value) {
        this.updateTime = value;
    }

}
