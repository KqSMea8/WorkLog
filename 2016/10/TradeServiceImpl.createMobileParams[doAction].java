   public CallResult<Map<String, String>> doAction() {
                            try {
                                Map<String, String> paraMap = new HashMap<String, String>();
                                // ����֧����ص���Կ
                                String partnerId = null;
                                String alipayId = null;
                                String priverRSAKey = null;
                                PayTypeEnum payType = PayTypeEnum.valueOf(tradeVO.getPayType());
                                if (payType == PayTypeEnum.MOBILE_CLIENT_ALIPAY_CASHIER
                                        || payType == PayTypeEnum.MOBILE_CLIENT_ALIPAY_SDK
                                        || payType == PayTypeEnum.MOBILE_CLIENT_ALIPAY_WAP) {
                                    // ֧����֧��
                                    // �û�֧��ʱ��ֱ��֧��Ϊ����
                                    paraMap.put(ALIPAY_PUBLIC_RSA, AlipayConfig.ALIPAY_PUBLIC_KEY);
                                    partnerId = AlipayConfig.WOWO_PARTNER_ID;
                                    alipayId = AlipayConfig.WOWO_SELLER_ID;
                                    priverRSAKey = AlipayConfig.WOWO_PRIVATE_KEY;
                                } else if (payType == PayTypeEnum.WEIXIN_JSAPI) {
                                    // ΢��֧����Կ���ؿ�
                                    paraMap.put(WEIXIN_APP_KEY, "");
                                    partnerId = WxServicepayConfig.WOWO_WX_PARTNER_ID;
                                    alipayId = WxServicepayConfig.WOWO_WX_APP_ID;
                                    priverRSAKey = WxServicepayConfig.WOWO_WX_APPKEY;
                                } else if (payType == PayTypeEnum.TENPAY_WEIXIN) {
                                    // ΢��֧����Կ���ؿ�
                                    paraMap.put(WEIXIN_APP_KEY, "");
                                    partnerId = WxpayAppConfig.WOWO_WX_PARTNER_ID;
                                    alipayId = WxpayAppConfig.WOWO_WX_APP_ID;
                                    priverRSAKey = WxpayAppConfig.WOWO_WX_APPKEY;
                                } else if (payType == PayTypeEnum.WEIXIN_SCANPAY) {
                                    // ΢�ű�ɨ��֧��
                                    // paraMap.put(key, value) //��һ��ò��ûɶ��
                                    partnerId = WxscanAppConfig.getWxScanPartnerID();
                                    alipayId = WxscanAppConfig.getWxScanAppID();
                                    priverRSAKey = WxscanAppConfig.getWxScanAppKey();
                                } else if (payType == PayTypeEnum.COMMON_SCANPAY) {
                                    // CommonPay
                                    // paraMap.put(key, value) //��һ��ò��ûɶ��
                                    partnerId = CommonScanConfig.getWxScanPartnerID();
                                    alipayId = CommonScanConfig.getWxScanAppID();
                                    priverRSAKey = CommonScanConfig.getWxScanAppKey();
                                } else if (payType == PayTypeEnum.WEIFUTONG_PAY) {
                                    // ΢��֧ͨ��
                                    partnerId = WftpayConfig.getWftPartnerID();
                                    alipayId = WftpayConfig.getWftAppID();
                                    priverRSAKey = WftpayConfig.getWftKey();
                                    logger.info("΢��֧ͨ��partnerId: " + partnerId + ",alipayId:" + alipayId
                                            + ",priverRSAKey:" + priverRSAKey);
                                } else if (payType == PayTypeEnum.ALIPAYSERVICE) {
                                    paraMap.put(ALIPAY_PUBLIC_RSA, AlipaywebConfig.getAlipayRSAPublicKey());
                                    partnerId = AlipaywebConfig.getAlipayPartnerId();
                                    alipayId = partnerId;
                                    priverRSAKey = AlipaywebConfig.getSHRSAPrivateKey();
                                    logger.info(String.format("֧�������񴰲�����partnerId --> %s , provateKey --> %s",
                                            partnerId, priverRSAKey));
                                } else if (payType == PayTypeEnum.WEIFUTONG_SCAN_PAY) {
                                    // ΢��֧ͨ��
                                    partnerId = WftScanPayConfig.getWftPartnerID();
                                    alipayId = WftScanPayConfig.getWftAppID();
                                    priverRSAKey = WftScanPayConfig.getWftKey();
                                    logger.info("΢��ͨС��֧��partnerId: " + partnerId + ",alipayId:" + alipayId
                                            + ",priverRSAKey:" + priverRSAKey);
                                } else if (payType == PayTypeEnum.NOWPAY_WXPAY || payType == PayTypeEnum.NOWPAY_ALIPAY) {
                                    partnerId = NowpayConfig.getNowpayPartnerID();
                                    alipayId = NowpayConfig.getNowpayAppID();
                                    priverRSAKey = NowpayConfig.getNowpayKey();
                                    logger.info("����֧��partnerId: " + partnerId + ",alipayId:" + alipayId
                                            + ",priverRSAKey:" + priverRSAKey);
                                } else if (payType == PayTypeEnum.NOWPAY_SCANPAY_WXPAY || payType == PayTypeEnum.NOWPAY_SCANPAY_ALIPAY) {
                                    partnerId = NowpayScanPayConfig.getNowpayscanpayPartnerID();
                                    alipayId = NowpayScanPayConfig.getNowpayscanpayAppID();
                                    priverRSAKey = NowpayScanPayConfig.getNowpayscanpayKey();
                                    logger.info("����֧��--��ɨ֧��partnerId: " + partnerId + ",alipayId:" + alipayId
                                            + ",priverRSAKey:" + priverRSAKey);
                                }
                                Map<String, String> result = null;
                                // ����tradeId�ж��Ƿ���Ҫ�����µĽ�����������ģ��
                                TradeDomain lastDomain = tradeDomainRepository
                                        .getLastDomainByTradeId(tradeVO.getTradeId());
                                // ���ν���ģ��
                                TradeDomain tradeDomain = null;
                                // true�������ӵ�domain
                                boolean boolCreate = false;
                                if (lastDomain == null) {
                                    // �����µĽ�������ģ��
                                    tradeDomain = tradeDomainRepository.createTradeDomain(tradeVO);
                                    tradeDomain.generateTradeNo(null);
                                    boolCreate = true;
                                } else {
                                    // �жϽ����Ƿ��Ѿ����
                                    if (lastDomain.getStatus() == PayConstants.PAY_STATUS_SUCCESS || lastDomain
                                            .getStatus() == PayConstants.PAY_STATUS_SUCCESS_CLOSE) {
                                        return CallResult
                                                .failure(PaygateBusinessCode.TRADE_CREATE_INVALID_TRADE_STATUS,
                                                        "the trade has finished,tradeId=" + tradeVO.getTradeId()
                                                                + ", status=" + lastDomain.getStatus());
                                    }
                                    // ����δ���
                                    // ���ݴ��ݵĽ��׺Ž����жϣ�����о��ô��ݽ��׺Ų�����ȫ�����߾�if����ȥ��
                                    tradeDomain = lastDomain;
                                    if (StringUtils.isNotBlank(tradeVO.getExternToken())) {
                                        tradeDomain.setExternToken(tradeVO.getExternToken());
                                    }
                                    // ����֧�����д���
                                    tradeDomain.setPayBank(tradeVO.getPayBank());
                                    if (StringUtils.isNotBlank(tradeVO.getTradeNo())) {
                                        if (!lastDomain.getTradeNO().equalsIgnoreCase(tradeVO.getTradeNo())) {
                                            // tradeNo�����ı䣬��ԭ���׺Źر�
                                            boolean boolClose = lastDomain.close();
                                            if (boolClose) {
                                                tradeDomainRepository.storageTradeDomainStatus(lastDomain);
                                            }
                                            // �ж��Ƿ�Ҫ�����µĽ�����ˮ��
                                            tradeDomain = tradeDomainRepository
                                                    .getTradeDomainByTradeNo(tradeVO.getTradeNo());
                                            if (tradeDomain == null) {
                                                boolCreate = true;
                                                tradeDomain = tradeDomainRepository.createTradeDomain(tradeVO);
                                                tradeDomain.setTradeNO(tradeVO.getTradeNo());
                                            }
                                        } else {
                                            tradeDomain.setPayType(tradeVO.getPayType());
                                        }
                                    } else {
                                        if (!lastDomain.isUserAble(tradeVO.getBusinessType(), tradeVO.getPayMoney(),
                                                PayTypeEnum.valueOf(tradeVO.getPayType()))) {
                                            // �ر���һ��������Ϣ
                                            boolean boolClose = lastDomain.close();
                                            if (boolClose) {
                                                tradeDomainRepository.storageTradeDomainStatus(lastDomain);
                                            }
                                            boolCreate = true;
                                            tradeDomain = tradeDomainRepository.createTradeDomain(tradeVO);
                                            // ��ȡ�µĽ��׺�
                                            tradeDomain.generateTradeNo(lastDomain.getTradeNO());
                                        }
                                    }
                                }

                                // ����˽Կ�Ƿ�Ϊ��
                                if (StringUtils.isBlank(partnerId) || StringUtils.isBlank(alipayId)
                                        || StringUtils.isBlank(priverRSAKey)) {
                                    return CallResult.failure(
                                            PaygateBusinessCode.TRADE_CREATE_PAY_INFO_INCORRECT,
                                            "merchant pay key  not set");
                                }
                                tradeDomain.setSellerAccountName(alipayId);
                                tradeDomain.setOpenId(tradeVO.getOpenId());
                                result = tradeDomain.getMobileResult(tradeVO.getPhoneIp(), tradeVO.getPhoneImei(),
                                        lastDomain == null ? null : lastDomain.getResult(), partnerId, alipayId,
                                        priverRSAKey);

                                if (boolCreate) {// ����
                                    tradeDomainRepository.storageNewTradeDomain(tradeDomain);
                                    tradeDomain.generateCreateLog();
                                } else {// ʲô�����ı��ˣ�����ʲô
                                    tradeDomainRepository.storageUpdateTradeDomain(tradeDomain);
                                }

                                // ����΢�ű�ɨ��֧��
                                if (payType == PayTypeEnum.WEIXIN_SCANPAY) {
                                    processWxScanPayResult(result.get("url"), tradeVO.getPhoneIp(),
                                            tradeDomain.getTradeNO());
                                }

                                // ����CommonPay
                                if (payType == PayTypeEnum.COMMON_SCANPAY) {
                                    processCommonScanPayResult(result.get("url"), tradeVO.getPhoneIp(),
                                            tradeDomain.getTradeNO());
                                }

                                // ����CommonPay
                                if (payType == PayTypeEnum.WEIFUTONG_SCAN_PAY) {
                                    processWeiFuTongScanPayResult(result.get("url"), tradeVO.getPhoneIp(),
                                            tradeDomain.getTradeNO(), tradeDomain.getTradeNO());
                                }

                                String mobileRequestParams = result.get("url");
                                if (StringUtils.isBlank(mobileRequestParams)) {
                                    return CallResult.failure(
                                            PaygateBusinessCode.TRADE_CREATE_ERROR,
                                            "create mobile request params return null");
                                }
                                paraMap.put(MOBILE_REQUEST_PARAM, result.get("url"));
                                return CallResult.success(PaygateBusinessCode.TRADE_CREATE_SUCCESS,
                                        "TRADE_CREATE_SUCCESS", paraMap);
                            } catch (Exception e) {
                                if (e instanceof RSAException) {
                                    return new CallResult<Map<String, String>>(false,
                                            PaygateBusinessCode.TRADE_CREATE_WRONG_RSA_KEY, e.getMessage(), null);
                                }
                                logger.error("create trade error", e);
                                return new CallResult<Map<String, String>>(false,
                                        PaygateBusinessCode.TRADE_CREATE_ERROR, e.getMessage(), null);
                            }
                        }