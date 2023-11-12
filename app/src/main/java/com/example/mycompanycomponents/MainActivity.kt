package com.example.mycompanycomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myuicomponents.MyDialogBox

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dialogFragment = MyDialogBox(
            title = "This is Title",
            info = "This is info",
            buttonMode = MyDialogBox.InfoDialogButtonMode.Both,
            nameBtnCancel = "No",
            nameBtnConfirm = "Yes",
            btnListener = object: MyDialogBox.ButtonClickListener {
                override fun onBtnCancelClick() {
                    Log.d(TAG,"onBtnCancelClick")
                }
                override fun onBtnConfirmClick() {
                    Log.d(TAG,"onBtnConfirmClick")
                }
            },
            isCancelableOnTouchOutside = true
        )

        dialogFragment.show(supportFragmentManager,null)
    }
}