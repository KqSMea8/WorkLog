public class OrderInfoDO extends TuanBaseDO{
	private static final long serialVersionUID = 1403007741682558315L;
	//����ID
	private String orderId;
	//�̻�ID
	private long supplierId;
	//�ŵ�ID
	private long shopId;
	//�ŵ�ǰ̨����
	private String shopName;
	//����ID
	private Integer cityId;
	//������
	private String secret;
	//��������:(0-�̼�App����, 1-�̼�Web���� 2-�û�����)
	private Integer orderChannel;
	//����״̬(0-δ��ʵ,1-�Ѻ�ʵ,2-��ȡ��,3-δ���ѹ���,4-δ֧���ѹ���,5-������)
	private Integer orderStatus;
	//��������ʱ�䣨����ʱ�䣩
	private long addTime;
	//�������û���Ч�ڣ�����ʱ�䣩
	private long bindLimitTime;
	//�û�ID
	private long userId;
	//�û��ֻ���
	private String mobile;
	//�û��豸��
	private String mid;
	//�û��󶨶����Ĳ���ϵͳ����
	private Integer ostype;
	//�������û�ʱ�䣨����ʱ�䣩
	private long bindTime;
	//�����ܽ��
	private BigDecimal billAmount;
	//���
	private BigDecimal surplus;
	//ʹ�õķ������
	private BigDecimal rebateUseMoney;
	//������֧�����
	private BigDecimal moneyPaid;
	//Ӧ������
	private BigDecimal orderAmount;
	//�����Żݼ۸�
	private BigDecimal orderOffMoney;
	//֧��״̬(0��δ����,1��������,2���Ѹ���)
	private Integer payStatus;
	//����֧����Ч�ڣ�����ʱ�䣩
	private long payLimitTime;
	//֧����ʽ
	private Integer payId;
	//֧����ʽ����
	private String payName;
	//����֧��ʱ�䣨����ʱ�䣩
	private long payTime;
	//֧��ͬ��״̬��0-�� 1-ͬ���� 2-��֧����
	private Integer paySync;
	//֧���˺�
	private String tradePayAccount;
	//������ˮ��
	private String tradeNo;
	//������������ˮ��
	private String thirdTradeNo;
	//������ʵʱ�䣨����ʱ�䣩
	private long confirmTime;
	//�����˿�ʱ�䣨����ʱ�䣩
	private long refundTime;
	//�˿�״̬(0������,-1���˿���,1���Ѳ����˿�,2����ȫ���˿�,)
	private Integer refundStatus;
	//�Ƿ������˿�(0-û��,1-�й�)
	private Integer isRefunded;
	//����ID
	private long schemaId;
	//��������
	private String schemaName;
	//��ͬID
	private long contractId;
	//���ֱ�����1.5%��¼Ϊ1.5��
	private BigDecimal rebateRate;
	//���˱�����1.5%��¼Ϊ1.5��
	private BigDecimal settlementRate;
	//������ԱID
	private long operatorId;
	//������Ա����
	private String operatorName;
	//�����豸��
	private String operatorMid;
	//�����µ���Դ(�豸��Դ ���簲,ƻ��)
	private String orderSource;
	//��������״̬(0������,1�������� ��ʾ�û��Լ����ش������״̬�Ķ���)
	private Integer orderUserHide;
	//��������״̬(0������,1�������� ��ʾ�̼����ش������״̬�Ķ���)
	private Integer orderShopHide;
	//��������ʱ�䣬��Ϊ��������ʱ��ά�Ȳ�ֵ�����
	private Integer routeTime;
	//�����뷵�ֽ��
	private BigDecimal noRebateMoney;
	//����״̬��0-δ���֣�1-�ѷ��֣�
	private Integer rebateStatus;
	//���ָ��û����
	private BigDecimal orderRebateMoney;
	//������ʱ��
	private long lastUpdateTime;
	//֧���ö������ָ��û����ܽ��
	private BigDecimal orderRebateTotalMoney;
	//�½�������ע
	private String remark;

    private long rebateTime; // ����ʱ��
	
	//��չ�ֶ�
	private Integer extendsFiled1;
	private Integer extendsFiled2;
	private Integer extendsFiled3;
	private Integer extendsFiled4;
	private long extendsFiled5;
	private String extendsFiled6;
	
	//�׵��������
	private BigDecimal firstTradeRebateMoney;
	
	
	
	
	// ������
		private BigDecimal payFee;
		
		// ������
		private BigDecimal jiesuanAmount;
	
	
	public BigDecimal getPayFee()
		{
			return payFee;
		}
		public void setPayFee(BigDecimal payFee)
		{
			this.payFee = payFee;
		}
		public BigDecimal getJiesuanAmount()
		{
			return jiesuanAmount;
		}
		public void setJiesuanAmount(BigDecimal jiesuanAmount)
		{
			this.jiesuanAmount = jiesuanAmount;
		}
	public BigDecimal getFirstTradeRebateMoney() {
		return firstTradeRebateMoney;
	}
	public void setFirstTradeRebateMoney(BigDecimal firstTradeRebateMoney) {
		this.firstTradeRebateMoney = firstTradeRebateMoney;
	}
	
	/**
	 * ֧��״̬(0��δ����,1��������,2���Ѹ���)
	 */
	private Integer payStatusOld;
	/**
	 * ����״̬(0-δ��ʵ,1-�Ѻ�ʵ,2-��ȡ��,3-δ���ѹ���,4-δ֧���ѹ���,5-������)
	 */
	private Integer orderStatusOld;
	/**
	 * ʹ�õķ������
	 */
	private BigDecimal rebateUseMoneyOld;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public BigDecimal getRebateUseMoneyOld() {
		return rebateUseMoneyOld;
	}
	public void setRebateUseMoneyOld(BigDecimal rebateUseMoneyOld) {
		this.rebateUseMoneyOld = rebateUseMoneyOld;
	}
	public Integer getOrderStatusOld() {
		return orderStatusOld;
	}
	public void setOrderStatusOld(Integer orderStatusOld) {
		this.orderStatusOld = orderStatusOld;
	}
	public Integer getPayStatusOld() {
		return payStatusOld;
	}
	public void setPayStatusOld(Integer payStatusOld) {
		this.payStatusOld = payStatusOld;
	}
	public Integer getOstype() {
		return ostype;
	}
	public void setOstype(Integer ostype) {
		this.ostype = ostype;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public long getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public Integer getOrderChannel() {
		return orderChannel;
	}
	public void setOrderChannel(Integer orderChannel) {
		this.orderChannel = orderChannel;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public long getAddTime() {
		return addTime;
	}
	public void setAddTime(long addTime) {
		this.addTime = addTime;
	}
	public long getBindLimitTime() {
		return bindLimitTime;
	}
	public void setBindLimitTime(long bindLimitTime) {
		this.bindLimitTime = bindLimitTime;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public long getBindTime() {
		return bindTime;
	}
	public void setBindTime(long bindTime) {
		this.bindTime = bindTime;
	}
	public BigDecimal getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}
	public BigDecimal getSurplus() {
		return surplus;
	}
	public void setSurplus(BigDecimal surplus) {
		this.surplus = surplus;
	}
	public BigDecimal getRebateUseMoney() {
		return rebateUseMoney;
	}
	public void setRebateUseMoney(BigDecimal rebateUseMoney) {
		this.rebateUseMoney = rebateUseMoney;
	}
	public BigDecimal getMoneyPaid() {
		return moneyPaid;
	}
	public void setMoneyPaid(BigDecimal moneyPaid) {
		this.moneyPaid = moneyPaid;
	}
	public BigDecimal getOrderMount() {
		return orderAmount;
	}
	public void setOrderMount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public BigDecimal getOrderOffMoney() {
		return orderOffMoney;
	}
	public void setOrderOffMoney(BigDecimal orderOffMoney) {
		this.orderOffMoney = orderOffMoney;
	}
	public Integer getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}
	public long getPayLimitTime() {
		return payLimitTime;
	}
	public void setPayLimitTime(long payLimitTime) {
		this.payLimitTime = payLimitTime;
	}
	public Integer getPayId() {
		return payId;
	}
	public void setPayId(Integer payId) {
		this.payId = payId;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public long getPayTime() {
		return payTime;
	}
	public void setPayTime(long payTime) {
		this.payTime = payTime;
	}
	public Integer getPaySync() {
		return paySync;
	}
	public void setPaySync(Integer paySync) {
		this.paySync = paySync;
	}
	public String getTradePayAccount() {
		return tradePayAccount;
	}
	public void setTradePayAccount(String tradePayAccount) {
		this.tradePayAccount = tradePayAccount;
	}
	public String getTradeNo() {
		return tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getThirdTradeNo() {
		return thirdTradeNo;
	}
	public void setThirdTradeNo(String thirdTradeNo) {
		this.thirdTradeNo = thirdTradeNo;
	}
	public long getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(long confirmTime) {
		this.confirmTime = confirmTime;
	}
	public long getRefundTime() {
		return refundTime;
	}
	public void setRefundTime(long refundTime) {
		this.refundTime = refundTime;
	}
	public Integer getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(Integer refundStatus) {
		this.refundStatus = refundStatus;
	}
	public Integer getIsRefunded() {
		return isRefunded;
	}
	public void setIsRefunded(Integer isRefunded) {
		this.isRefunded = isRefunded;
	}
	public long getSchemaId() {
		return schemaId;
	}
	public void setSchemaId(long schemaId) {
		this.schemaId = schemaId;
	}
	public String getSchemaName() {
		return schemaName;
	}
	public void setSchemaName(String schemaName) {
		this.schemaName = schemaName;
	}
	public long getContractId() {
		return contractId;
	}
	public void setContractId(long contractId) {
		this.contractId = contractId;
	}
	public BigDecimal getRebateRate() {
		return rebateRate;
	}
	public void setRebateRate(BigDecimal rebateRate) {
		this.rebateRate = rebateRate;
	}
	public BigDecimal getSettlementRate() {
		return settlementRate;
	}
	public void setSettlementRate(BigDecimal settlementRate) {
		this.settlementRate = settlementRate;
	}
	public long getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(long operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getOperatorMid() {
		return operatorMid;
	}
	public void setOperatorMid(String operatorMid) {
		this.operatorMid = operatorMid;
	}
	public String getOrderSource() {
		return orderSource;
	}
	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}
	public Integer getOrderUserHide() {
		return orderUserHide;
	}
	public void setOrderUserHide(Integer orderUserHide) {
		this.orderUserHide = orderUserHide;
	}
	public Integer getOrderShopHide() {
		return orderShopHide;
	}
	public void setOrderShopHide(Integer orderShopHide) {
		this.orderShopHide = orderShopHide;
	}
	public Integer getRouteTime() {
		return routeTime;
	}
	public void setRouteTime(Integer routeTime) {
		this.routeTime = routeTime;
	}
	public Integer getExtendsFiled1() {
		return extendsFiled1;
	}
	public void setExtendsFiled1(Integer extendsFiled1) {
		this.extendsFiled1 = extendsFiled1;
	}
	public Integer getExtendsFiled2() {
		return extendsFiled2;
	}
	public void setExtendsFiled2(Integer extendsFiled2) {
		this.extendsFiled2 = extendsFiled2;
	}
	public Integer getExtendsFiled3() {
		return extendsFiled3;
	}
	public void setExtendsFiled3(Integer extendsFiled3) {
		this.extendsFiled3 = extendsFiled3;
	}
	public Integer getExtendsFiled4() {
		return extendsFiled4;
	}
	public void setExtendsFiled4(Integer extendsFiled4) {
		this.extendsFiled4 = extendsFiled4;
	}
	public long getExtendsFiled5() {
		return extendsFiled5;
	}
	public void setExtendsFiled5(long extendsFiled5) {
		this.extendsFiled5 = extendsFiled5;
	}
	public String getExtendsFiled6() {
		return extendsFiled6;
	}
	public void setExtendsFiled6(String extendsFiled6) {
		this.extendsFiled6 = extendsFiled6;
	}
	public BigDecimal getNoRebateMoney() {
		return noRebateMoney;
	}
	public void setNoRebateMoney(BigDecimal noRebateMoney) {
		this.noRebateMoney = noRebateMoney;
	}
	public Integer getRebateStatus() {
		return rebateStatus;
	}
	public void setRebateStatus(Integer rebateStatus) {
		this.rebateStatus = rebateStatus;
	}
	public BigDecimal getOrderRebateMoney() {
		return orderRebateMoney;
	}
	public void setOrderRebateMoney(BigDecimal orderRebateMoney) {
		this.orderRebateMoney = orderRebateMoney;
	}
	public long getLastUpdateTime() {
		return lastUpdateTime;
	}
	public void setLastUpdateTime(long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}
	public BigDecimal getOrderRebateTotalMoney() {
		return orderRebateTotalMoney;
	}
	public void setOrderRebateTotalMoney(BigDecimal orderRebateTotalMoney) {
		this.orderRebateTotalMoney = orderRebateTotalMoney;
	}


    public long getRebateTime() {
        return rebateTime;
    }

    public void setRebateTime(long rebateTime) {
        this.rebateTime = rebateTime;
    }
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
}