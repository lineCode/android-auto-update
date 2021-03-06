package com.chengtao.autoupdate;

/**
 * Created by ChengTao on 2016-08-19.
 */
@SuppressWarnings("ALL")
/**
 * 自动更新接口
 */
public interface AutoUpdateInterface {
    /**
     * 确定更新
     */
    public void autoUpdateComfirm();

    /**
     * 取消更新
     */
    public void autoUpdateCancle();
}
