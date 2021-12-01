package com.example.bobbykotlin



import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("brilly", "Laki-laki", "brilly@gmail.com,"
                , "08887085140", "Sby")
        )
        listTeman.add(
            MyFriend("imantirta", "Laki-laki", "imantirta@gmail.com",
                "081234567890", "Sby")
        )
        listTeman.add(
            MyFriend("Crisjhon", "Laki-laki", "Crisjhon@gmail.com",
                "081234567890", "NGanjuk")
        )
        listTeman.add(
            MyFriend("Jordie", "laki-laki", "Jordie@gmail.com",
                "081234567890", "malang")
        )
        listTeman.add(
            MyFriend("wjoaj", "Laki-laki", "wjoaj@gmail.com",
                "081234567890", "nganjuk")
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun tampilTeman() {
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()

    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}