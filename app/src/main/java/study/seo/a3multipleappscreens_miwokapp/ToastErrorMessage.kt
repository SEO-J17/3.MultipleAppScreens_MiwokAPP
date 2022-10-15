package study.seo.a3multipleappscreens_miwokapp

import android.content.Context
import android.widget.Toast

class ToastErrorMessage {
    fun errorMessage(context: Context) {
        return Toast
            .makeText(
                context,
                "Layout의 ID값을 찾을 수 없습니다!",
                Toast.LENGTH_SHORT
            ).show()
    }
}
