package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)
        val result = intent.getFloatExtra("EXTRA_RESULT",0.1f)

        tvResult.text = result.toString()

            val classificacao = if (result < 18.5){
            "VOCÊ ESTÁ ABAIXO DO PESO. Procure uma equipe médica especializada no tratamento adequado para você."
        }else if (result in 18.5f..24.9f){
            "Parabéns, você está com o seu peso dentro da normalidade, conforme a tabela I.M.C."
        }else if (result in 25f..29.9f){
            "SOBREPESO - GRAU I, Procure o seu Médico siga as Orientações de um Profissional de Saúde."
        }else if(result in 30.9f..39.9f){
            "OBESIDADE - GRAU II, Procure o seu Médico siga as Orientações de um Profissional de Saúde."
        }else {
            "OBESIDADE - GRAU III, Procure o seu Médico siga as Orientações de um Profissional de Saúde."
        }

                tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}









