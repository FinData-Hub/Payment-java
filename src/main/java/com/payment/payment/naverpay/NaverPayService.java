package com.payment.payment.naverpay;

import com.payment.payment.common.PaymentService;
import org.springframework.stereotype.Service;

/**
 * 네이버페이 결제 서비스
 */
@Service
public class NaverPayService implements PaymentService {

    @Override
    public void processPayment() {
        // TODO: 네이버페이 결제 구현
    }

    @Override
    public void cancelPayment() {
        // TODO: 네이버페이 결제 취소 구현
    }

    @Override
    public void getPaymentStatus() {
        // TODO: 네이버페이 결제 조회 구현
    }
}

