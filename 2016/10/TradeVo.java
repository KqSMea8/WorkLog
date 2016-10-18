public class TradeVO extends TuanBaseDO {
	private static final long serialVersionUID = 8839304993097645977L;
	/**
	 * �ǿ� ҵ��[�ֻ���֧��ҵ��:40]     
	 * **/
	private int businessType;
	/**
	 * �ǿ� ����id  [����id;��ֵid]��
	 * **/
	private String tradeId;
	/**
	 * �ǿ� ��Ʒ����,��ֵ����      
	 * **/
	private String subject;
	/**
	 * �ǿ� ֧�����[��λ:��]      
	 * **/
	private int payMoney;
	/**
	 * �ǿ� ֧����ʽ  [	30:�ֻ��ͻ���֧����Ǯ��֧��;
	 * 				31:�ֻ��ͻ��˼�������̨֧��;
	 * 				32:�ֻ��ͻ���֧������ҳ֧��;
	 * 				
	 * 				41:΢�Ź��ں�֧��;]          
	 * **/
	private int payType;
	/**
	 * �ǿ� �ŵ�ID     
	 * **/
	private long shopID;
	/**�̻�id**/
	private long supplierID;
	
	/**
	 * �ǿ� ֧�����ͣ�Ĭ���ǣ���Ʒ����           
	 * **/
	private String paymentType;
	/**
	 * �ǿա���Ʒ����           
	 * **/
	private String body;
	/**
	 * �ǿ�    ֧���û���γ��
	 */
	private String payLongitude;
	private String payLatitude;
	
	/**
	 * ΢�Ź��ں�֧��ʱ���ǿ�   �û���ʶ
	 */
	private String openId;
	/**
	 * ����ʱ�������[15(Ĭ��15����)]           
	 * **/
	private int expireTime;
	/**
	 * �������첽֪ͨҳ��·��(�����ַָ����֧����֪֧ͨ�����صĵ�ַ,����������,�ͻ��˵��ò�����д)      
	 * **/
	private String notifyURL;
	
	/**
	 * ��Ʒչʾ��ַ      
	 * **/
	private String showURL;
	/**
	 * �̻���վΨһ������,��֧����������,����ͻ����Ѿ�����,�봫����     
	 * **/
	private String tradeNo;
	/**
	 * �����û�id     
	 * **/
	private String outUser;
	/**
	 * ֧�������ص���Ȩ����,�������.     
	 * **/
	private String externToken;
	/**
	 * �ͻ��˺�      
	 * **/
	private String appID;
	/**
	 * �ͻ�����Դ     
	 * **/
	private String appEnv;
	
	/**
	 * �ֻ�֧��ʹ�õ�IP
	 */
	private  String phoneIp;
	/**
	 * �ֻ�IMEI��
	 */
	private String phoneImei;
	
	////������wap��ʽ�Ĳ���	
	
	/**
	 * ֧���ɹ���תҳ��     
	 * **/
	private String callBackURL;
	/**
	 * �����жϷ��ص�ַ     
	 * **/
	private String merchantURL;
	
	/////�������ʱδ��
	
	/**
	 * ֧�����ص�����ʱ����,������д     
	 * **/
	private String thirdPayUserID;
	/**
	 * ֧�����ص�����ʱ����,������д          
	 * **/
	private String thirdPayUserName;
	/**
	 *  ֧�����ص�����ʱ����,������д         
	 * **/
	private String thirdTradeNO;
	
	/**
	 *  ���ѷ��� Ŀǰʹ��call_back_url    
	 * **/
	private String redirectPath;
	/**
	 * Ŀǰֻ��֧������ʽ     
	 * **/
	private String payBank;
	
	/** ������Ʒ����*/
	private int tradeGoodsAmount;
	
	/** ΢�ű�ɨ��֧��ʱ�ṩ����Ȩ�� */
	private String wxAuthCode;
	
	public long getSupplierID() {
		return supplierID;
	}
	public void setSupplierID(long supplierID) {
		this.supplierID = supplierID;
	}
			
	public int getTradeGoodsAmount() {
		return tradeGoodsAmount;
	}
	public void setTradeGoodsAmount(int tradeGoodsAmount) {
		this.tradeGoodsAmount = tradeGoodsAmount;
	}
	public int getBusinessType() {
		return businessType;
	}
	public void setBusinessType(int type) {
		this.businessType = type;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getPayMoney() {
		return payMoney;
	}
	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}
	public int getPayType() {
		return payType;
	}
	public void setPayType(int payType) {
		this.payType = payType;
	}
	public String getPayBank() {
		return payBank;
	}
	public void setPayBank(String payBank) {
		this.payBank = payBank;
	}
	public int getExpireTime() {
		return expireTime;
	}
	public void setExpireTime(int expireTime) {
		this.expireTime = expireTime;
	}
	public String getNotifyURL() {
		return notifyURL;
	}
	public void setNotifyURL(String notifyURL) {
		this.notifyURL = notifyURL;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getAppID() {
		return appID;
	}
	public void setAppID(String appID) {
		this.appID = appID;
	}
	public String getAppEnv() {
		return appEnv;
	}
	public void setAppEnv(String appEnv) {
		this.appEnv = appEnv;
	}
	public String getCallBackURL() {
		return callBackURL;
	}
	public void setCallBackURL(String callBackURL) {
		this.callBackURL = callBackURL;
	}
	public String getMerchantURL() {
		return merchantURL;
	}
	public void setMerchantURL(String merchantURL) {
		this.merchantURL = merchantURL;
	}
	public String getThirdPayUserID() {
		return thirdPayUserID;
	}
	public void setThirdPayUserID(String thirdPayUserID) {
		this.thirdPayUserID = thirdPayUserID;
	}
	public String getThirdPayUserName() {
		return thirdPayUserName;
	}
	public void setThirdPayUserName(String thirdPayUserName) {
		this.thirdPayUserName = thirdPayUserName;
	}
	public String getRedirectPath() {
		return redirectPath;
	}
	public void setRedirectPath(String redirectPath) {
		this.redirectPath = redirectPath;
	}
	public String getThirdTradeNO() {
		return thirdTradeNO;
	}
	public void setThirdTradeNO(String thirdTradeNO) {
		this.thirdTradeNO = thirdTradeNO;
	}
	public String getExternToken() {
		return externToken;
	}
	public void setExternToken(String externToken) {
		this.externToken = externToken;
	}
	public String getOutUser() {
		return outUser;
	}
	public void setOutUser(String outUser) {
		this.outUser = outUser;
	}

	public String getPhoneIp() {
		return phoneIp;
	}
	public void setPhoneIp(String phoneIp) {
		this.phoneIp = phoneIp;
	}
	public String getPhoneImei() {
		return phoneImei;
	}
	public void setPhoneImei(String phoneImei) {
		this.phoneImei = phoneImei;
	}
	public long getShopID() {
		return shopID;
	}
	public void setShopID(long shopID) {
		this.shopID = shopID;
	}
	public String getPayLongitude() {
		return payLongitude;
	}
	public void setPayLongitude(String payLongitude) {
		this.payLongitude = payLongitude;
	}
	public String getPayLatitude() {
		return payLatitude;
	}
	public void setPayLatitude(String payLatitude) {
		this.payLatitude = payLatitude;
	}
	public String getShowURL() {
		return showURL;
	}
	public void setShowURL(String showURL) {
		this.showURL = showURL;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getWxAuthCode() {
		return wxAuthCode;
	}
	public void setWxAuthCode(String wxAuthCode) {
		this.wxAuthCode = wxAuthCode;
	}
	@Override
	public String toString() {
		return "TradeVO [businessType=" + businessType + ", tradeId=" + tradeId + ", subject=" + subject + ", payMoney="
				+ payMoney + ", payType=" + payType + ", shopID=" + shopID + ", supplierID=" + supplierID
				+ ", paymentType=" + paymentType + ", body=" + body + ", payLongitude=" + payLongitude
				+ ", payLatitude=" + payLatitude + ", openId=" + openId + ", expireTime=" + expireTime + ", notifyURL="
				+ notifyURL + ", showURL=" + showURL + ", tradeNo=" + tradeNo + ", outUser=" + outUser
				+ ", externToken=" + externToken + ", appID=" + appID + ", appEnv=" + appEnv + ", phoneIp=" + phoneIp
				+ ", phoneImei=" + phoneImei + ", callBackURL=" + callBackURL + ", merchantURL=" + merchantURL
				+ ", thirdPayUserID=" + thirdPayUserID + ", thirdPayUserName=" + thirdPayUserName + ", thirdTradeNO="
				+ thirdTradeNO + ", redirectPath=" + redirectPath + ", payBank=" + payBank + ", tradeGoodsAmount="
				+ tradeGoodsAmount + ", wxAuthCode=" + wxAuthCode + "]";
	}