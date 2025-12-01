package com.payment.payment.common;

/**
 * 결제 서비스 공통 인터페이스
 */
public interface PaymentService {
    
    /**
     * 결제 요청
     */
    void processPayment();
    
    /**
     * 결제 취소
     */
    void cancelPayment();
    
    /**
     * 결제 조회
     */
    void getPaymentStatus();
}

