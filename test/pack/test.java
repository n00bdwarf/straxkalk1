package pack;

import static org.junit.Assert.*;

import org.junit.Test;

import kalk.klient;

public class test {

	@Test
	public void test1() {
		// �������� ����������
		// �� 70 �� 100 �.�.
		// ����� 22 ���, ���� ����� 3 ���
		// ��� �����������
		float k1=(float)1.1,k2=1,k3=1980,k4=(float)1.8;
		int s;
		//s - �������� �� ������� sums, ������������� � ������ klient
		s=klient.sums(k1,k2,k3,k4);
		// tests - �������� ��������
		int tests=7057;
		// �������� ������
		assertEquals((int)tests,s);
	}
}
