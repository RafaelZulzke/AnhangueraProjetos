using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Globalization;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
//Acima as Bibliotecas estão sendo importadas
//Nome do Projeto Abaixo
namespace CalculadorV2
{
    //Corpo Principal do Form
    public partial class Form1 : Form
    {
        Double valor1, valor2;
        String Op;

        public Form1()
        {
            InitializeComponent();
        }

        //Botão 6 = Sair
        private void button6_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }
        //Botão 7 = Limpar
        private void button5_Click(object sender, EventArgs e)
        {
            valor1 = 0;
            valor2 = 0;
            textBox1.Clear();
            textBox1.Focus();
        }
        //Botão 4 = Divisao
        private void button4_Click(object sender, EventArgs e)
        {
            valor1 = Convert.ToDouble(textBox1.Text);
            Op = "/";
            textBox1.Clear();
            textBox1.Focus();
        }
        //Botão 3 = Multiplicação
        private void button3_Click(object sender, EventArgs e)
        {
            valor1 = Convert.ToDouble(textBox1.Text);
            Op = "*";
            textBox1.Clear();
            textBox1.Focus();
        }
        private void button7_Click(object sender, EventArgs e)
        {
            valor2 = Convert.ToDouble(textBox1.Text);
            switch (Op)
            {
                case "+":
                    {
                        textBox1.Text = Convert.ToString(valor1 + valor2);
                        break;
                    }
                case "-":
                    {
                        textBox1.Text = Convert.ToString(valor1 - valor2);
                        break;
                    }
                case "*":
                    {
                        textBox1.Text = Convert.ToString(valor1 * valor2);
                        break;
                    }
                case "/":
                    {
                        textBox1.Text = Convert.ToString(valor1 / valor2);
                        break;
                    }
            }
        }
        //Botão 1 = Adição
        private void button1_Click(object sender, EventArgs e)
        {
            valor1 = Convert.ToDouble(textBox1.Text);
            Op = "+";
            textBox1.Clear();
            textBox1.Focus();
        }
        //Botão 2 = Subtração
        private void button2_Click(object sender, EventArgs e)
        {
            valor1 = Convert.ToDouble(textBox1.Text);
            Op = "-";
            textBox1.Clear();
            textBox1.Focus();
        }
        //Botão 18 = 0
        private void button18_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                textBox1.Text = "0";
            }
            else
            {
                textBox1.Text = textBox1.Text + "0";
            }
        }
        //Botão 10 = 1
        private void button10_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "")
            {
                textBox1.Text = "1";
            }
            else
            {
                textBox1.Text = textBox1.Text + "1";
            }
        }
        //Botão 9 = 2
        private void button9_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                textBox1.Text = "2";
            }
            else
            {
                textBox1.Text = textBox1.Text + "2";
            }
        }
        //Botão 12 = 3
        private void button12_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "")
            {
                textBox1.Text = "3";
            }
            else
            {
                textBox1.Text = textBox1.Text + "3";
            }
        }
        //Botão 11 = 4
        private void button11_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "")
            {
                textBox1.Text = "4";
            }
            else
            {
                textBox1.Text = textBox1.Text + "4";
            }
        }
        //Botão 14 = 5
        private void button14_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "")
            {
                textBox1.Text = "5";
            }
            else
            {
                textBox1.Text = textBox1.Text + "5";
            }
        }
        //Botão 13 = 6
        private void button13_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                textBox1.Text = "6";
            }
            else
            {
                textBox1.Text = textBox1.Text + "6";
            }
        }
        //Botão 15 = 7
        private void button15_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "")
            {
                textBox1.Text = "7";
            }
            else
            {
                textBox1.Text = textBox1.Text + "7";
            }
        }
        //Botão 16 = 8
        private void button16_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                textBox1.Text = "8";
            }
            else
            {
                textBox1.Text = textBox1.Text + "8";
            }
        }

        private void button8_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "")
            {
                textBox1.Text = ".";
            }
            else
            {
                textBox1.Text = textBox1.Text + ".";
            }
        }

        //Botão 17 = 9
        private void button17_Click(object sender, EventArgs e)
        {

            if (textBox1.Text == "")
            {
                textBox1.Text = "9";
            }
            else
            {
                textBox1.Text = textBox1.Text + "9";
            }
        }
    }
}

