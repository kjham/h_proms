package Main;

import TEMPLATEMETHOD.*;

// ����
// �޼ҵ忡�� �˰����� ����� ����
// �˰����� ���� �ܰ� �� �Ϻδ� ����Ŭ�������� ����
// ���ø� �޼ҵ带 �̿��ϸ� �˰����� ������ �״�� ���� ��
// �׸��� ���� Ŭ�������� Ư�� �ܰ踸 ������ ����

// �渮��� ��Ģ : ���� �������� ������. ���� ���� �帱�Կ�.
// �̸� ���� ������ ���и� ���� ����

// �� ���� Ŭ������ ���ø� �޼ҵ尡 ��������.. ����Ŭ�������� ���� ����������. �����Ҳ�. ��� �渮��� ��Ģ�� ���� ��

public class CaffeinBeverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaffeinBeverage coffee = new Coffee();
		CaffeinBeverage tea = new Tea();
		
		coffee.prepareRecipe();
		System.out.println("\n");
		tea.prepareRecipe();
	}

}
