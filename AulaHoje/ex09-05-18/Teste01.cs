using System;
using System.Drawing;
using System.Windows.Forms;

namespace ex09_05_18
{
	
	public partial class Teste01 : Form
	{
		
		public Teste01()
		{
			InitializeComponent();
		}
		
		public string combustivel;
		void Button1Click(object sender, EventArgs e)
		{
	
			if(textBox1.Text == "")
			{
				MessageBox.Show("Dados Incorretos Tente Novamente");
			}
			else
			{
				comboBox1.Items.Add(textBox1.Text);
				comboBox1.Focus();
			}
		}
		
		void Button3Click(object sender, EventArgs e)
		{
			combustivel = comboBox1.SelectedItem.ToString();
			this.Visible=false;
			
		}
		
		void Button2Click(object sender, EventArgs e)
		{	
			comboBox1.Items.Remove(comboBox1.SelectedItem);
		}
	}
}
