package org.codingwallah.em_project;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import lombok.AllArgsConstructor;
import lombok.Data;//fetching data
import lombok.NoArgsConstructor;

@Data // after using this no need to use geter seter methid for data variable 
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements List<Employee> {
    private long id;
    private String name;
    private String phone;
    private String email;

    

    void setId(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<Employee> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(Employee e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Collection<? extends Employee> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(int index, Collection<? extends Employee> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee get(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee set(int index, Employee element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void add(int index, Employee element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee remove(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator<Employee> listIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator<Employee> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Employee> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

 

   


    
    
}
