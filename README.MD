# ��������� SPRING TEST
�������� ����������� �.�������� � �.��������� �� JPoint-2017
https://youtu.be/7mZqJShu_3c

    "..������ ������ �� ����� ���������� � ������������ ��� cooking book, �.�. ���������� ���� ����������� ������ �����������, ����� ��������� ������ � ����,��� ��� ������ ���������" 
-������� �� ������� ������������ �� 14:00

# ������� � ���������: ������������ ������ ����������:
-������ �������:
    @ContextConfiguration
    @ContextHierarchy && @DirtiesContext
    @ActiveProfiles
-��� ������ �� Spring Boot?
    @SpringBootTest
    @TestConfiguration
    @MockBean && @SpyBean && @*Beans
    @DataJpaTest
    @WebMvcTest
-����������� spring ����������
-����� ������

�� �� ����� ���� �����-�� ������ ���������� ����������� �� TDD � �������� ��� ��������� � ���� ����������� ���������� �����. ���� ������� - �������� ����������� ����������� ����������� ������ ����� ������ ������������, �� � ����� ����� ����� ���������� ������������� ����������� �� ������ ����� �����.

����� ����� �� ����� ������? 
������ �� "����� ������" ����� �������� ��������� ��������:
    
    Unit -> Component -->-->--> Microservice -> System test 

���� ������� ����-�����, ������� ������ �������: ����� new ������� ������, ����������� ��� ������, ��� �� ������� � ��� ���.

��������� ������� - component-test,  ��� ��� ����� ����� ������� -��������, � ��� ���� ������, � ������� ���������� ���, ��� �������� � �����-�� ������� ��... �������������� ���� ������� �������,�������� ���������� ������-�� ��������..

����� ���-to-end ����, � � ���� ����� ������������, ��������� �� ����������� �� ����,���������������� ����� ������������- ��� ��� ��� ������, �������� � ������ ��������/�������������.

��������� - System test - ������� ������������� �� �����.

# ����� 1, ������� ������

���� ����������,������� �� ����� ����������� - ��� ��� ���������, � ������� ���� ��������, ������� �������� ������������� �������� �� �������.
                                   
                              ---  ???? --- 
                            |default answers| 
                            |   database    |
                              -- _______ --
                                    ^
     ______             ____________v__
    |__��__| <--web--> |___assistant___| <----.
                        ^             |       |   
                      rest           rest    rest
              __________v______    ___v_______|______
             |jbaruch-assistant|  |yegor256-assistant| <--> Queue

�� �������� � ���,� ������ ������ �����-�� ������, � ��� �������� ���� �� ���������. 
asistant-������ �������� ��� ������: �������� ������, �� �������� ������ ��������,������� �������� ����������, ���� ���� ���������� �� �������� ������ ������ � ���� ��������� �������.

����� �������� ������ ���������, ������� ��� ������ ����� ������������, � ������� �� �������� ������� �������. � ���� ����������� ��� ���� ������� � �������, ������, �������� ��� ����� � ���������� � �������� ������� �� �������� ����, ������� ��� ������ ���������� ������. 
