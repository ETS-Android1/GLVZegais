package com.glvz.egais.integration;

import com.glvz.egais.integration.model.*;
import com.glvz.egais.model.IncomeRec;

import java.io.File;
import java.util.List;

/**
 * Created by pasha on 07.06.18.
 */
public interface Integration {

    List<ShopIn> loadShops();

    List<PostIn> loadPosts();

    List<NomenIn> loadNomen();

    List<UserIn> loadUsers();

    void initDirectories(String shopId);

    List<IncomeIn> loadIncome(String shopId);

    void writeIncomeRec(String shopId, IncomeRec incomeRec);

    File loadNewApk();

    void clearOldData(int numDaysOld);
}
