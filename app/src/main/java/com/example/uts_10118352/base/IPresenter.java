package com.example.uts_10118352.base;

//05 June 2021, 10118352, Andre Hilmi Pratama, IF8
public interface IPresenter<T extends IView, IView> {
    void onAttach(T view);
    void onDetach();
}
