using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;
using System.Text.RegularExpressions;

namespace ex2
{
	/// <summary>
	/// Description of MainForm.
	/// </summary>
	public partial class MainForm : Form
	{
		double despesaal, despesag;
		
		public MainForm()
		{
			
			InitializeComponent();
			

		}
		public void CalculoAl(double dist, double consumoal, double preçoal)
		{
			
			despesaal = (dist/consumoal)*preçoal;
			textBox6.Text=despesaal.ToString();
		}
		
		public void CalculoG(double dist,double consumog, double preçog)
		{
			despesag = (dist/consumog)*preçog;
			textBox6.Text=despesag.ToString();
		}
		void Button1Click(object sender, EventArgs e)
		{
            try
            {
                if (textBox5.Text == "" || textBox3.Text == "" || textBox4.Text == "" || textBox1.Text == "" || textBox2.Text == "" && textBox5.Text == "0" || textBox3.Text == "0" || textBox4.Text == "0" || textBox1.Text == "0" || textBox2.Text == "0")
                {
                    MessageBox.Show("Preencha todos dados, Distancia, Consumo KM/L Gasolina e Alcool e Preço Litro Gasolina e Alcool. Não aceitamos valores negativos,vazios ou letras");
                    return;
                }
                else
                {
                    CalculoAl(double.Parse(textBox5.Text), double.Parse(textBox1.Text), double.Parse(textBox2.Text));
                    CalculoG(double.Parse(textBox5.Text), double.Parse(textBox3.Text), double.Parse(textBox4.Text));
                    if (despesag < despesaal)
                    {
                        panel1.Enabled = false;
                        textBox6.Text = despesag.ToString();
                    }
                    else if (despesaal < despesag)
                    {
                        panel2.Enabled = false;
                        textBox6.Text = despesaal.ToString();
                    }
                    else
                    {
                        textBox6.Text = despesag.ToString();
                    }
                }
            }
            catch
            {
                MessageBox.Show("Preencha o KM/L do Alcool. Não aceitamos vazio, letras e numeros negativos");
                MessageBox.Show("Preencha o Preço Litro do Alcool. Não aceitamos vazio, letras e numeros negativos");
                MessageBox.Show("Preencha o KM/L da Gasolina. Não aceitamos vazio, letras e numeros negativos");
                MessageBox.Show("Preencha o KM/L da Gasolina. Não aceitamos vazio, letras e numeros negativos");
                textBox1.Clear();
                textBox2.Clear();
                textBox3.Clear();
                textBox4.Clear();
            }
            /*
            if (textBox5.Text =="" || textBox3.Text == "" || textBox4.Text == ""||textBox1.Text == "" ||textBox2.Text == "" && textBox5.Text =="0" || textBox3.Text == "0" || textBox4.Text == "0"||textBox1.Text == "0" ||textBox2.Text == "0")
            {
                MessageBox.Show("Preencha todos os dados");
            }
            else
            {
                CalculoAl(double.Parse(textBox5.Text), double.Parse(textBox1.Text), double.Parse(textBox2.Text));
                CalculoG(double.Parse(textBox5.Text), double.Parse(textBox3.Text), double.Parse(textBox4.Text));
                if(despesag < despesaal)
                {
                    panel1.Enabled = false;
                    textBox6.Text=despesag.ToString();
                }
                else if(despesaal < despesag)
                {
                    panel2.Enabled = false;
                    textBox6.Text=despesaal.ToString();
                }
                else
                {
                    textBox6.Text=despesag.ToString();
                }
            }
            */
        }
		void RadioButton1CheckedChanged(object sender, EventArgs e)
		{
			if(radioButton1.Checked == true)
			{
                //Primeiro Try Catch
                try
                {
                    if (double.Parse(textBox5.Text) == 0)
                    {
                        MessageBox.Show("A Distancia não pode ser zero");
                        return;
                    }
                    else
                    {
                        if (double.Parse(textBox5.Text) < 0)
                        {
                            MessageBox.Show("Use apenas numeros positivos na Distancia");
                            return;
                        }
                        else
                        {
                         CalculoAl(double.Parse(textBox5.Text), double.Parse(textBox1.Text), double.Parse(textBox2.Text));
                        }
                    }
                }
                catch
                {
                   if (textBox5.Text == "")
                    {
                        MessageBox.Show("A Distancia não pode estar vazia");
                        return;
                    }
                    else
                    {
                        if(textBox5.Text != "[^0-9]" && textBox5.Text != "[^.]");
                        {
                            MessageBox.Show("Não aceita-se letras como Distancia");
                            return;
                        }
                        
                    }
                }
                /*if(textBox5.Text == "" || textBox1.Text == "" ||textBox2.Text == "" && textBox5.Text == "0" || textBox1.Text == "0" || textBox2.Text == "0")
				{
					MessageBox.Show("Preencha todos os dados");
					radioButton1.Checked=false;
                    return;
				}
				else
				{
                 CalculoAl(double.Parse(textBox5.Text), double.Parse(textBox1.Text), double.Parse(textBox2.Text));
                }*/
            }
        }
		
		void RadioButton2CheckedChanged(object sender, EventArgs e)
		{
			if(radioButton2.Checked == true)
			{
                try
                {
                    if (double.Parse(textBox5.Text) == 0)
                    {
                        MessageBox.Show("A Distancia não pode ser zero");
                        return;
                    }
                    else
                    {
                        if (double.Parse(textBox5.Text) < 0)
                        {
                            MessageBox.Show("Use apenas numeros positivos na Distancia");
                            return;
                        }
                        else
                        {
                            CalculoG(double.Parse(textBox5.Text), double.Parse(textBox3.Text), double.Parse(textBox4.Text));
                        }
                    }
                }
                catch
                {
                    if (textBox5.Text == "")
                    {
                        MessageBox.Show("A Distancia não pode estar vazia");
                        return;
                    }
                    else
                    {
                        if (textBox5.Text != "[^0-9]" && textBox5.Text != "[^.]") ;
                        {
                            MessageBox.Show("Não aceita-se letras como Distancia");
                            return;
                        }

                    }
                }
                /*if(textBox5.Text =="" || textBox3.Text == "" || textBox4.Text == "" && textBox5.Text == "0" || textBox3.Text == "0" || textBox4.Text == "0")
				{
					MessageBox.Show("Preencha todos os dados");
					radioButton2.Checked=false;
				}
				else
				{

					CalculoG(double.Parse(textBox5.Text), double.Parse(textBox3.Text), double.Parse(textBox4.Text));
				}*/
            }	
		}
		void Button2Click(object sender, EventArgs e)
		{
			panel1.Enabled = true;
			panel2.Enabled = true;
			textBox1.Clear();
			textBox2.Clear();
			textBox3.Clear();
			textBox4.Clear();
			textBox5.Clear();
			textBox6.Clear();
		}
		void Button3Click(object sender, EventArgs e)
		{
			Application.Exit();
			
		}
		void TextBox1TextChanged(object sender, EventArgs e)
		{
			try
            {
                double.Parse(textBox1.Text);
                if (double.Parse(textBox1.Text) == 0)
                {
                    MessageBox.Show("O KM/L do Alcool não pode ser zero");
                    return;
                }
            }
			catch
			{
				MessageBox.Show("Preencha o KM/L do Alcool. Não aceitamos vazio, letras e numeros negativos");
				textBox1.Clear();
			}
		}

        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            try
            {
                double.Parse(textBox3.Text);
                if (double.Parse(textBox3.Text) == 0)
                {
                    MessageBox.Show("O KM/L da Gasolina não pode ser zero");
                    return;
                }
            }
            catch
            {
                MessageBox.Show("Preencha o KM/L da Gasolina. Não aceitamos vazio, letras e numeros negativos");
                textBox3.Clear();
            }
        }

        private void textBox4_TextChanged(object sender, EventArgs e)
        {
            try
            {
                double.Parse(textBox4.Text);
                if (double.Parse(textBox4.Text) == 0)
                {
                    MessageBox.Show("O KM/L da Gasolina não pode ser zero");
                    return;
                }
            }
            catch
            {
                MessageBox.Show("Preencha o KM/L da Gasolina. Não aceitamos vazio, letras e numeros negativos");
                textBox4.Clear();
            }
        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {
        	try{
        		double.Parse(textBox5.Text);
        		if (double.Parse(textBox5.Text) < 0)
        		{
        			MessageBox.Show("Nao aceita numero negativo");
        			textBox5.Clear();
        			return;
        		}
        	}
        	catch{
        		
        	}
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            try
            {
                double.Parse(textBox2.Text);
                if (double.Parse(textBox2.Text) == 0)
                {
                    MessageBox.Show("O Preço Litro do Alcool não pode ser zero");
                    return;
                }
            }
            catch
            {
                MessageBox.Show("Preencha o Preço Litro do Alcool. Não aceitamos vazio, letras e numeros negativos");
                textBox2.Clear();
            }
        }

	}
}
