package com.knta.jickbangcopy_20220227.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.knta.jickbangcopy_20220227.R
import com.knta.jickbangcopy_20220227.datas.RoomData

class RoomAdapter(
    val mContext: Context,
    resId: Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData>(mContext, resId, mList) {  // Ctrl + P => 지원 생성자 목록 조회

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow =  convertView

        if (tempRow == null) {
            tempRow =  LayoutInflater.from(mContext).inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddressFloor = row.findViewById<TextView>(R.id.txtAddressFloor)
        val txtDescription = row.findViewById<TextView>(R.id.txtDescription)

        txtPrice.text = data.getFormattedPrice()

        txtDescription.text =  data.description

        txtAddressFloor.text = "${data.address}, ${data.getFormattedFloor()}"

        return row
    }

}