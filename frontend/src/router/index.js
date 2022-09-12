import { createRouter, createWebHistory } from 'vue-router';
import PkindexView from "../views/pk/PkindexView"
import NotFound from "../views/error/NotFound"

const routes = [
  {
    path: '/',
    name: 'PK',
    redirect: '/pk/'
  },
  {
    path: '/pk/',
    name: 'PK',
    component: PkindexView
  },
  {
    path: '/404/',
    name: '404',
    component: NotFound
  },
  
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router
