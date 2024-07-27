import React from 'react'

export const Navbar = () => {
  return (
    <div className=" bg-slate-800 h-16 px-16 items-center flex">
    <h1 className="text-3xl font-bold  "> 👨🏻‍💼 JD Infotech Employee Service</h1>
    <div className='space-x-4 ml-auto'>
    <a className='hover:text-blue-400 ' href='/'>Home</a>
    <a className='hover:text-blue-400 ' href='/'>Profile</a>
    <a className='hover:text-blue-400 ' href='/'>LogOut</a>
    </div>
  </div>
  )
}

export default Navbar;