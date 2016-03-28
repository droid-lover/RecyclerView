// Generated code from Butter Knife. Do not modify!
package example.com.recyclerviewdemo.Adapters;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class RecyclerViewHolder$$ViewBinder<T extends example.com.recyclerviewdemo.Adapters.RecyclerViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492992, "field 'tv1'");
    target.tv1 = finder.castView(view, 2131492992, "field 'tv1'");
    view = finder.findRequiredView(source, 2131492993, "field 'tv2'");
    target.tv2 = finder.castView(view, 2131492993, "field 'tv2'");
    view = finder.findRequiredView(source, 2131492991, "field 'imageView'");
    target.imageView = finder.castView(view, 2131492991, "field 'imageView'");
  }

  @Override public void unbind(T target) {
    target.tv1 = null;
    target.tv2 = null;
    target.imageView = null;
  }
}
