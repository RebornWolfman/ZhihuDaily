package com.baiiu.zhihudaily.base.list.holder;

import android.content.Context;
import android.view.ViewGroup;
import com.baiiu.zhihudaily.R;
import com.baiiu.zhihudaily.base.BaseViewHolder;

/**
 * author: baiiu
 * date: on 16/4/11 15:05
 * description:
 */
public class LoadingViewHolder extends BaseViewHolder<String> {
    public LoadingViewHolder(Context mContext, ViewGroup parent) {
        super(mContext, R.layout.layout_loading, parent);
    }

    @Override public void bind(String data) {

    }
}
