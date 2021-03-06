package io.julian.appchooser.module.mediatypes;

import java.util.List;

import io.julian.appchooser.data.MediaType;
import io.julian.appchooser.module.base.BasePresenter;
import io.julian.appchooser.module.base.BaseView;

/**
 * @author Zhu Liang
 * @version 1.0
 * @since 2017/4/15 下午5:42
 */

public interface MediaTypesContract {

    interface View extends BaseView<Presenter> {
        void showMediaTypes(List<MediaType> mediaTypes);
    }

    interface Presenter extends BasePresenter {
        void loadMediaTypes();
    }
}
