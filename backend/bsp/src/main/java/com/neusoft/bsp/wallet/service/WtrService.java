package com.neusoft.bsp.wallet.service;

import com.neusoft.bsp.wallet.entity.Wtr;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WtrService {

    int insertWtr(Wtr wtr);

    List<Wtr> searchWtrByBuyerId(int buyer_id);

    List<Wtr> searchAllWtrByFilter();

    Wtr searchWtrById(int transaction_id);

    int updateWtrStatus(int transaction_id, int status);


}