using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsAppPostoCombustivel
{
    public partial class Form1 : Form
    {
        double despesaalcool, despesaagasolina;

        public Form1()
        {
            InitializeComponent();
        }

        public void CalculoAlcool(double distancia, double consumoalcool, double preco1)
        {

            despesaalcool = (distancia / consumoalcool) * preco1;
            txtDespesa.Text = despesaalcool.ToString();
          
        }

        public void CalculoGasolina(double distancia, double consumogasolina, double preco2)
        {

            despesaagasolina = (distancia / consumogasolina) * preco2;
            txtDespesa.Text = despesaagasolina.ToString();
            
        }

        private void button1_Click(object sender, EventArgs e)
        {

            if (txtDistancia.Text == "" || txtConsumo1.Text == "" || txtPreco1.Text == "" || txtConsumo2.Text == "" || txtPreco2.Text == "")
            {

                MessageBox.Show("Preencha todos os campos em branco!");

            }
            else
            {
                CalculoAlcool(double.Parse(txtDistancia.Text), (double.Parse(txtConsumo1.Text)), (double.Parse(txtPreco1.Text)));
                CalculoGasolina(double.Parse(txtDistancia.Text), (double.Parse(txtConsumo2.Text)), (double.Parse(txtPreco2.Text)));
				if (despesaagasolina < despesaalcool)
                {                
                    panel1.Enabled = false;
                    txtDespesa.Text = despesaagasolina.ToString();
                }
                else if(despesaalcool < despesaagasolina)
                {
                    panel2.Enabled = false;
                    txtDespesa.Text = despesaalcool.ToString();
                }
                else
                {
                    txtDespesa.Text = despesaagasolina.ToString();
                }
            }
        }


        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        void radioButton1_CheckedChanged(object sender, EventArgs e)
        {

            if(radioBtAlcool.Checked == true)
            {

                if(txtPreco2.Text =="" || txtDistancia.Text == "" || txtConsumo1.Text =="")
                {
                    MessageBox.Show("Preencha todos os campos em branco");
                    radioBtAlcool.Checked = false;
                }
                else
                {
                    CalculoAlcool(double.Parse(txtPreco2.Text), double.Parse(txtDistancia.Text), double.Parse(txtConsumo1.Text));
                }
            }

        }

        void radioButton2_CheckedChanged(object sender, EventArgs e)
        {
            if (radioBtGasolina.Checked == true)
            {
                if (txtPreco2.Text == "" || txtPreco1.Text == "" || txtConsumo2.Text == "")
                {
                    MessageBox.Show("Preencha todos os campos em branco");
                    radioBtGasolina.Checked = false;
                }
                else
                {
                   CalculoGasolina(double.Parse(txtPreco2.Text), double.Parse(txtPreco1.Text), double.Parse(txtConsumo2.Text));
                }
            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            panel1.Enabled = true;
            panel2.Enabled = true;
            txtDistancia.Clear();
            txtConsumo1.Clear();
            txtPreco1.Clear();
            txtConsumo2.Clear();
            txtPreco2.Clear();
            txtDespesa.Clear();


        }

        private void txtDistancia_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtConsumo1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}
