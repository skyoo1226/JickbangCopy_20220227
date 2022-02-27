package com.knta.jickbangcopy_20220227

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.knta.jickbangcopy_20220227.adapters.RoomAdapter
import com.knta.jickbangcopy_20220227.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000, "서울시 동대문구", 7, "1번째 방입니다."))
        mRoomList.add( RoomData(15000, "서울시 서대문구", 5, "2번째 방입니다."))
        mRoomList.add( RoomData(27000, "서울시 중구", 6, "3번째 방입니다."))
        mRoomList.add( RoomData(9000, "서울시 천호구", -1, "4번째 방입니다."))
        mRoomList.add( RoomData(6500, "서울시 강북구", 1, "5번째 방입니다."))
        mRoomList.add( RoomData(38000, "서울시 옆구", 3, "6번째 방입니다."))
        mRoomList.add( RoomData(21800, "서울시 서구", 2, "7번째 방입니다."))
        mRoomList.add( RoomData(9800, "서울시 남구", 10, "8번째 방입니다."))
        mRoomList.add( RoomData(11000, "서울시 강남구", 17, "9번째 방입니다."))
        mRoomList.add( RoomData(15000, "서울시 의정구", 11, "10번째 방입니다."))
        mRoomList.add( RoomData(8600, "서울시 면목구", -2, "11번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter




    }
}
