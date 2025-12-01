package com.payment.payment.kakaopay;

import com.payment.payment.common.PaymentService;
import org.springframework.stereotype.Service;

/**
 * 카카오페이 결제 서비스
 */
@Service
public class KakaoPayService implements PaymentService {

    @Override
    public void processPayment() {
        // TODO: 카카오페이 결제 구현
    }

    @Override
    public void cancelPayment() {
        // TODO: 카카오페이 결제 취소 구현
    }

    @Override
    public void getPaymentStatus() {
        // TODO: 카카오페이 결제 조회 구현
    }
}

