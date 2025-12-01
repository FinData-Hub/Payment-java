package com.payment.payment.tosspay;

import com.payment.payment.common.PaymentService;
import org.springframework.stereotype.Service;

/**
 * 토스페이 결제 서비스
 */
@Service
public class TossPayService implements PaymentService {

    @Override
    public void processPayment() {
        // TODO: 토스페이 결제 구현
    }

    @Override
    public void cancelPayment() {
        // TODO: 토스페이 결제 취소 구현
    }

    @Override
    public void getPaymentStatus() {
        // TODO: 토스페이 결제 조회 구현
    }
}

