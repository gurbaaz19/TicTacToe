package com.example.tictactoe

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var mCounter = 0
    var mList: ArrayList<Char> = arrayListOf('0', '0', '0', '0', '0', '0', '0', '0', '0')

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val player1 = intent.getStringExtra(Constants.USER_NAME_1)
        val player2 = intent.getStringExtra(Constants.USER_NAME_2)
        tv_player1.text = player1
        tv_player2.text = player2

        iv_1.setOnClickListener { move(it, player1, player2) }
        iv_2.setOnClickListener { move(it, player1, player2) }
        iv_3.setOnClickListener { move(it, player1, player2) }
        iv_4.setOnClickListener { move(it, player1, player2) }
        iv_5.setOnClickListener { move(it, player1, player2) }
        iv_6.setOnClickListener { move(it, player1, player2) }
        iv_7.setOnClickListener { move(it, player1, player2) }
        iv_8.setOnClickListener { move(it, player1, player2) }
        iv_9.setOnClickListener { move(it, player1, player2) }
    }

    private fun move(view: View?, player1: String?, player2: String?) {
        set(view)
        prompt()
        check(view, player1, player2)
        Log.i("Move", mList.toString())
    }

    private fun set(view: View?) {
        when (view?.id) {
            R.id.iv_1 -> {
                if (mCounter % 2 == 0 && mList[0] == '0' && mCounter < 9) {
                    iv_1.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[0] = 'X'
                } else if (mList[0] == '0' && mCounter < 9) {
                    iv_1.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[0] = 'O'
                }
            }
            R.id.iv_2 -> {
                if (mCounter % 2 == 0 && mList[1] == '0' && mCounter < 9) {
                    iv_2.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[1] = 'X'
                } else if (mList[1] == '0' && mCounter < 9) {
                    iv_2.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[1] = 'O'
                }
            }
            R.id.iv_3 -> {
                if (mCounter % 2 == 0 && mList[2] == '0' && mCounter < 9) {
                    iv_3.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[2] = 'X'
                } else if (mList[2] == '0') {
                    iv_3.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[2] = 'O'
                }
            }
            R.id.iv_4 -> {
                if (mCounter % 2 == 0 && mList[3] == '0' && mCounter < 9) {
                    iv_4.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[3] = 'X'
                } else if (mList[3] == '0' && mCounter < 9) {
                    iv_4.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[3] = 'O'
                }
            }
            R.id.iv_5 -> {
                if (mCounter % 2 == 0 && mList[4] == '0' && mCounter < 9) {
                    iv_5.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[4] = 'X'
                } else if (mList[4] == '0' && mCounter < 9) {
                    iv_5.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[4] = 'O'
                }
            }
            R.id.iv_6 -> {
                if (mCounter % 2 == 0 && mList[5] == '0' && mCounter < 9) {
                    iv_6.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[5] = 'X'
                } else if (mList[5] == '0' && mCounter < 9) {
                    iv_6.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[5] = 'O'
                }
            }
            R.id.iv_7 -> {
                if (mCounter % 2 == 0 && mList[6] == '0' && mCounter < 9) {
                    iv_7.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[6] = 'X'
                } else if (mList[6] == '0' && mCounter < 9) {
                    iv_7.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[6] = 'O'
                }
            }
            R.id.iv_8 -> {
                if (mCounter % 2 == 0 && mList[7] == '0' && mCounter < 9) {
                    iv_8.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[7] = 'X'
                } else if (mList[7] == '0' && mCounter < 9) {
                    iv_8.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[7] = 'O'
                }
            }
            R.id.iv_9 -> {
                if (mCounter % 2 == 0 && mList[8] == '0' && mCounter < 9) {
                    iv_9.setImageResource(R.drawable.cross)
                    mCounter++
                    mList[8] = 'X'
                } else if (mList[8] == '0' && mCounter < 9) {
                    iv_9.setImageResource(R.drawable.circle)
                    mCounter++
                    mList[8] = 'O'
                }
            }
        }
    }

    private fun check(view: View?, player1: String?, player2: String?) {
        if (((mList[0] == 'X') && (mList[1] == 'X') && (mList[2] == 'X')) ||
            ((mList[0] == 'X') && (mList[3] == 'X') && (mList[6] == 'X')) ||
            ((mList[0] == 'X') && (mList[4] == 'X') && (mList[8] == 'X')) ||
            ((mList[1] == 'X') && (mList[4] == 'X') && (mList[7] == 'X')) ||
            ((mList[2] == 'X') && (mList[5] == 'X') && (mList[8] == 'X')) ||
            ((mList[2] == 'X') && (mList[4] == 'X') && (mList[6] == 'X')) ||
            ((mList[3] == 'X') && (mList[4] == 'X') && (mList[5] == 'X')) ||
            ((mList[6] == 'X') && (mList[7] == 'X') && (mList[8] == 'X'))
        ) {
            Log.i("Move", "Player 1")
            tv_player1.setTextColor(resources.getColor(R.color.winner))
            tv_player2.setTextColor(resources.getColor(R.color.noTurn))
            tv_result.text = "$player1 is the winner !!!"

            for (i in 0..8) {
                if (mList[i] == '0') {
                    mList[i] = 'F'
                }
            }
        } else if (((mList[0] == 'O') && (mList[1] == 'O') && (mList[2] == 'O')) ||
            ((mList[0] == 'O') && (mList[3] == 'O') && (mList[6] == 'O')) ||
            ((mList[0] == 'O') && (mList[4] == 'O') && (mList[8] == 'O')) ||
            ((mList[1] == 'O') && (mList[4] == 'O') && (mList[7] == 'O')) ||
            ((mList[2] == 'O') && (mList[5] == 'O') && (mList[8] == 'O')) ||
            ((mList[2] == 'O') && (mList[4] == 'O') && (mList[6] == 'O')) ||
            ((mList[3] == 'O') && (mList[4] == 'O') && (mList[5] == 'O')) ||
            ((mList[6] == 'O') && (mList[7] == 'O') && (mList[8] == 'O'))
        ) {
            Log.i("Move", "Player 2")
            tv_player1.setTextColor(resources.getColor(R.color.noTurn))
            tv_player2.setTextColor(resources.getColor(R.color.winner))
            tv_result.text = "$player2 is the winner !!!"

            for (i in 0..8) {
                if (mList[i] == '0') {
                    mList[i] = 'F'
                }
            }
        } else if (mCounter > 8) {
            Log.i("Move", "Draw")
            tv_player1.setTextColor(resources.getColor(R.color.noTurn))
            tv_player2.setTextColor(resources.getColor(R.color.noTurn))
            tv_result.text = "Draw !!!"
        }
    }

    private fun prompt() {
        if (mCounter % 2 == 0) {
            tv_player1.setTextColor(resources.getColor(R.color.turn))
            tv_player2.setTextColor(resources.getColor(R.color.noTurn))
        } else {
            tv_player1.setTextColor(resources.getColor(R.color.noTurn))
            tv_player2.setTextColor(resources.getColor(R.color.turn))

        }
    }

}